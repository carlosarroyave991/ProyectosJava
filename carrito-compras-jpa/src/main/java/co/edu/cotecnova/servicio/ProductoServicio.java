package co.edu.cotecnova.servicio;

import co.edu.cotecnova.entidad.Producto;
import co.edu.cotecnova.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoServicio {
    @Autowired
    private ProductoRepositorio productoRepositorio;

    public List<Producto> listarProductos(){

        return productoRepositorio.findAll();
    }

    public Producto obtenerProducto(Integer id){
        return listarProductos().stream().filter(p->p.getId().equals(id)).findAny().orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("La id %d no encontrada",id)));
    }

    public Producto crearProducto(Producto producto){

        return productoRepositorio.save(producto);
    }

    public Producto actualizarProducto(Integer id, Producto producto){
        Optional<Producto> productoBuscar=productoRepositorio.findById(id);
        if(productoBuscar.isPresent()){
            return productoRepositorio.save(producto);
        }else{
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, String.format("El producto con id %d no fue encontrado.", id));
        }
    }

    public void productoEliminar(Integer id){
        Producto eliminar=obtenerProducto(id);
        listarProductos().remove(eliminar);
    }
}
