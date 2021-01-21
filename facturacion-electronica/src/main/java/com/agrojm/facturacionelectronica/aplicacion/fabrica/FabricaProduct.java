package com.agrojm.facturacionelectronica.aplicacion.fabrica;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoProduct;
import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import org.springframework.stereotype.Component;

@Component
public class FabricaProduct {
    public Product crear(ComandoProduct comandoProduct){
        return new Product(comandoProduct.getProductId(), comandoProduct.getCode(), comandoProduct.getName(), comandoProduct.getPrice(), comandoProduct.isActive(),comandoProduct.getCreationDate());
    }
}
