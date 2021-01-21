package com.agrojm.facturacionelectronica.aplicacion.manejadores.product;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoProduct;
import com.agrojm.facturacionelectronica.aplicacion.fabrica.FabricaProduct;
import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.dominio.servicio.ProductService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarProduct {
    private FabricaProduct fabricaProduct;
    private ProductService productService;

    public ManejadorActualizarProduct(FabricaProduct fabricaProduct, ProductService productService) {
        this.fabricaProduct = fabricaProduct;
        this.productService = productService;
    }

    public Product ejecutar(ComandoProduct comandoProduct, int productId){
        Product product = fabricaProduct.crear(comandoProduct);
        return productService.update(product, productId);
    }
}
