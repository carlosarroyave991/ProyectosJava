package com.agrojm.facturacionelectronica.aplicacion.manejadores.sale;

import com.agrojm.facturacionelectronica.dominio.modelo.Sale;
import com.agrojm.facturacionelectronica.dominio.servicio.SaleService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarTodosSale {
    private SaleService saleService;

    public ManejadorListarTodosSale(SaleService saleService) {
        this.saleService = saleService;
    }

    public List<Sale> ejecutar(){
        return saleService.getAll();
    }
}
