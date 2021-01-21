package com.agrojm.facturacionelectronica.aplicacion.manejadores.client;

import com.agrojm.facturacionelectronica.dominio.servicio.ClientService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorEliminarClient {
    private ClientService clientService;

    public ManejadorEliminarClient(ClientService clientService) {
        this.clientService = clientService;
    }

    public void ejecutar(int clientId){
        clientService.delete(clientId);
    }
}
