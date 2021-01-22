package com.agrojm.facturacionelectronica.aplicacion.manejadores.sale;

import com.agrojm.facturacionelectronica.dominio.modelo.Sale;
import com.agrojm.facturacionelectronica.dominio.servicio.SaleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ManejadorPaginadorSale {
    private SaleService saleService;

    public ManejadorPaginadorSale(SaleService saleService) {
        this.saleService = saleService;
    }

    public Page<Sale> ejecutar(Pageable pageable){
        return saleService.findAll(pageable);
    }
}
