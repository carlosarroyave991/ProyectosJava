package com.agrojm.facturacionelectronica.aplicacion.manejadores.client;

import com.agrojm.facturacionelectronica.dominio.modelo.Client;
import com.agrojm.facturacionelectronica.dominio.servicio.ClientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;

@Component
public class ManejadorPaginarClient {
    private ClientService clientService;

    public ManejadorPaginarClient(ClientService clientService) {
        this.clientService = clientService;
    }

    public Page<Client> ejecutar(Pageable pageable){
        return clientService.findAll(pageable);
    }
}
