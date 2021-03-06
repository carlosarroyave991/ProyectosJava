package com.agrojm.facturacionelectronica.aplicacion.manejadores.product;

import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.dominio.servicio.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarTodosProduct {
    private ProductService productService;

    public ManejadorListarTodosProduct(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> ejecutar(){
        return productService.getAll();
    }
}
