package com.agrojm.facturacionelectronica.infraestructura.controlador;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoSaleProduct;
import com.agrojm.facturacionelectronica.aplicacion.manejadores.saleproduct.ManejadorCrearSaleProduct;
import com.agrojm.facturacionelectronica.aplicacion.manejadores.saleproduct.ManejadorEliminarSaleProduct;
import com.agrojm.facturacionelectronica.dominio.modelo.SaleProduct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/saleproducts")
public class VentaProductoController {
    private ManejadorCrearSaleProduct manejadorCrearSaleProduct;
    private ManejadorEliminarSaleProduct manejadorEliminarSaleProduct;

    public VentaProductoController(ManejadorCrearSaleProduct manejadorCrearSaleProduct, ManejadorEliminarSaleProduct manejadorEliminarSaleProduct) {
        this.manejadorCrearSaleProduct = manejadorCrearSaleProduct;
        this.manejadorEliminarSaleProduct = manejadorEliminarSaleProduct;
    }

    @PostMapping
    public ResponseEntity<SaleProduct> save(@RequestBody ComandoSaleProduct comandoSaleProduct){
        return new ResponseEntity<>(manejadorCrearSaleProduct.ejecutar(comandoSaleProduct), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") int saleProductId){
        manejadorEliminarSaleProduct.ejecutar(saleProductId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
