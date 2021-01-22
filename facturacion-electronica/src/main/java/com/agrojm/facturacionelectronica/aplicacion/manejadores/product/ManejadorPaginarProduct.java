package com.agrojm.facturacionelectronica.aplicacion.manejadores.product;

import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.dominio.servicio.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ManejadorPaginarProduct {
    private ProductService productService;

    public ManejadorPaginarProduct(ProductService productService) {
        this.productService = productService;
    }

    public Page<Product> ejecutar(Pageable pageable){
        return productService.findAll(pageable);
    }
}
