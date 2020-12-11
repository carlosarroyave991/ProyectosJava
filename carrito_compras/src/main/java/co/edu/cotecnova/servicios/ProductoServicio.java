package co.edu.cotecnova.servicios;

import co.edu.cotecnova.modelos.Producto;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.*;
import java.util.ArrayList;

@Service
public class ProductoServicio {
    private List<Producto> productos = new ArrayList<>();

    public List<Producto> obtenerProductos(){
        return productos;
    }

    public Producto obtenerProductoPorReferencia(String referencia){
        return productos.stream().filter(p->p.getReferencia().equals(referencia)).findAny().orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("Referencia %s no encontrado",referencia)));
    }

    public Producto crearReferencia(Producto producto){
        if (productos.stream().anyMatch(p -> p.getReferencia().equals(producto.getReferencia()))) {
            throw new ResponseStatusException(HttpStatus.CONFLICT, String.format("El Producto %s ya existe", producto.getReferencia()));
        }
        productos.add(producto);
        return producto;
    }

    public Producto actualizarProducto(Producto producto, String referencia){
        Producto productoActualizar = obtenerProductoPorReferencia(referencia);
        productoActualizar.setNombre(producto.getNombre());
        productoActualizar.setPrecio(producto.getPrecio());
        productoActualizar.setReferencia(producto.getReferencia());
        return productoActualizar;
    }

    public void eliminarProducto(String referencia){
        Producto productoEliminar = obtenerProductoPorReferencia(referencia);
        productos.remove(productoEliminar);
    }
}
