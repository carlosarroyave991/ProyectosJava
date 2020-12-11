package co.edu.cotecnova.controladores;

import co.edu.cotecnova.modelos.Producto;
import co.edu.cotecnova.modelos.Usuario;
import co.edu.cotecnova.servicios.ProductoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoControlador {
    @Autowired
    private ProductoServicio productoServicio;

    @GetMapping
    public ResponseEntity<List<Producto>> obtenerProductos(){
        return new ResponseEntity<List<Producto>>(productoServicio.obtenerProductos(), HttpStatus.OK);
    }

    @GetMapping(value = "/{referencia}")
    public ResponseEntity<Producto> obtenerProductoPorReferencia(@PathVariable ("referencia")String referencia){
        return new ResponseEntity<Producto>(productoServicio.obtenerProductoPorReferencia(referencia), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto){
        return new ResponseEntity<Producto>(productoServicio.crearReferencia(producto), HttpStatus.OK);
    }

    @PutMapping(value = "/{referencia}")
    public ResponseEntity<Producto> actualizarProducto(@PathVariable String referencia, @RequestBody Producto producto){
        return new ResponseEntity<Producto>(productoServicio.actualizarProducto(producto, referencia), HttpStatus.OK);
    }

    @DeleteMapping(value = "/{referencia}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable String referencia){
        productoServicio.eliminarProducto(referencia);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
