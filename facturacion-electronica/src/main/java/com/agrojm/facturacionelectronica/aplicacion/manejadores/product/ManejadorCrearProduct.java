package com.agrojm.facturacionelectronica.aplicacion.manejadores.product;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoProduct;
import com.agrojm.facturacionelectronica.aplicacion.fabrica.FabricaProduct;
import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.dominio.servicio.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearProduct {
    private ProductService productService;
    private FabricaProduct fabricaProduct;

    public ManejadorCrearProduct(ProductService productService, FabricaProduct fabricaProduct) {
        this.productService = productService;
        this.fabricaProduct = fabricaProduct;
    }

    public Product ejecutar(ComandoProduct comandoProduct){
        Product product = fabricaProduct.crear(comandoProduct);
        return productService.save(product);
    }
}
