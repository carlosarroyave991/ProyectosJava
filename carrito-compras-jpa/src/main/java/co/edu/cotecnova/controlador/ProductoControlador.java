package co.edu.cotecnova.controlador;

import co.edu.cotecnova.entidad.Producto;
import co.edu.cotecnova.repositorio.ProductoRepositorio;
import co.edu.cotecnova.servicio.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/productos")
@RestController
public class ProductoControlador {
    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping
    public ResponseEntity<List<Producto>>listarProductos(){
        return new ResponseEntity<List<Producto>>(productoServicio.listarProductos(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto){
        return new ResponseEntity<Producto>(productoServicio.crearProducto(producto), HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable (name = "id") Integer id,@RequestBody Producto producto){
        return new ResponseEntity<Producto>(productoServicio.actualizarProducto(id, producto), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> productoEliminar(@PathVariable Integer id){
        productoServicio.productoEliminar(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
