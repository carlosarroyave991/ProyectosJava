package com.agrojm.facturacionelectronica.aplicacion.manejadores.sale;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoSale;
import com.agrojm.facturacionelectronica.aplicacion.fabrica.FabricaSale;
import com.agrojm.facturacionelectronica.dominio.modelo.Sale;
import com.agrojm.facturacionelectronica.dominio.servicio.SaleService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarSale {
    private SaleService saleService;
    private FabricaSale fabricaSale;

    public ManejadorActualizarSale(SaleService saleService, FabricaSale fabricaSale) {
        this.saleService = saleService;
        this.fabricaSale = fabricaSale;
    }

    public Sale ejecutar(ComandoSale comandoSale, int saleId){
        Sale sale = fabricaSale.crear(comandoSale);
        return saleService.update(sale, saleId);
    }
}
