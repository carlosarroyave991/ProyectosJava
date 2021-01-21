package com.agrojm.facturacionelectronica.aplicacion.manejadores.product;

import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.dominio.servicio.ProductService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ManejadorListarPorIdProduct {
    private ProductService productService;

    public ManejadorListarPorIdProduct(ProductService productService) {
        this.productService = productService;
    }

    public Optional<Product> ejecutar(int productId){
        return productService.findById(productId);
    }
}
