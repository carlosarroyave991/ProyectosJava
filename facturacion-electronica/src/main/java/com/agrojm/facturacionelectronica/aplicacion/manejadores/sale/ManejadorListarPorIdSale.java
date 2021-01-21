package com.agrojm.facturacionelectronica.aplicacion.manejadores.sale;

import com.agrojm.facturacionelectronica.dominio.modelo.Sale;
import com.agrojm.facturacionelectronica.dominio.servicio.SaleService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ManejadorListarPorIdSale {
    private SaleService saleService;

    public ManejadorListarPorIdSale(SaleService saleService) {
        this.saleService = saleService;
    }

    public Optional<Sale> ejecutar(int saleId){
        return saleService.findById(saleId);
    }
}
