package com.agrojm.facturacionelectronica.aplicacion.manejadores.saleproduct;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoSaleProduct;
import com.agrojm.facturacionelectronica.aplicacion.fabrica.FabricaSaleProduct;
import com.agrojm.facturacionelectronica.dominio.modelo.SaleProduct;
import com.agrojm.facturacionelectronica.dominio.servicio.SaleProductService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearSaleProduct {
    private SaleProductService saleProductService;
    private FabricaSaleProduct fabricaSaleProduct;

    public ManejadorCrearSaleProduct(SaleProductService saleProductService, FabricaSaleProduct fabricaSaleProduct) {
        this.saleProductService = saleProductService;
        this.fabricaSaleProduct = fabricaSaleProduct;
    }

    public SaleProduct ejecutar(ComandoSaleProduct comandoSaleProduct){
        SaleProduct saleProduct = fabricaSaleProduct.crear(comandoSaleProduct);
        return saleProductService.save(saleProduct);
    }
}
