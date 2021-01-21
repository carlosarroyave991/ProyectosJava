package com.agrojm.facturacionelectronica.aplicacion.manejadores.sale;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoSale;
import com.agrojm.facturacionelectronica.aplicacion.fabrica.FabricaSale;
import com.agrojm.facturacionelectronica.dominio.modelo.Sale;
import com.agrojm.facturacionelectronica.dominio.servicio.SaleService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearSale {
    private SaleService saleService;
    private FabricaSale fabricaSale;

    public ManejadorCrearSale(SaleService saleService, FabricaSale fabricaSale) {
        this.saleService = saleService;
        this.fabricaSale = fabricaSale;
    }

    public Sale ejecutar(ComandoSale comandoSale){
        Sale sale = fabricaSale.crear(comandoSale);
        return saleService.save(sale);
    }
}
