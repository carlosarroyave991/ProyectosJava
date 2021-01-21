package com.agrojm.facturacionelectronica.aplicacion.manejadores.product;

import com.agrojm.facturacionelectronica.dominio.servicio.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarProduct {
    private ProductService productService;

    public ManejadorEliminarProduct(ProductService productService) {
        this.productService = productService;
    }

    public void ejecutar(int productId){
        productService.delete(productId);
    }
}
