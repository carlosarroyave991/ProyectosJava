package com.agrojm.facturacionelectronica.aplicacion.fabrica;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoSaleProduct;
import com.agrojm.facturacionelectronica.dominio.modelo.SaleProduct;
import org.springframework.stereotype.Component;

@Component
public class FabricaSaleProduct {
    public SaleProduct crear(ComandoSaleProduct comandoSaleProduct){
        return new SaleProduct(comandoSaleProduct.getSaleProductId(), comandoSaleProduct.getProductId(), comandoSaleProduct.getSaleId(), comandoSaleProduct.getQuantity());
    }
}
