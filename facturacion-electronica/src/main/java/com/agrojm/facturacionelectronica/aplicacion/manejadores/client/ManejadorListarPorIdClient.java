package com.agrojm.facturacionelectronica.aplicacion.manejadores.client;

import com.agrojm.facturacionelectronica.dominio.modelo.Client;
import com.agrojm.facturacionelectronica.dominio.servicio.ClientService;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class ManejadorListarPorIdClient {
    private ClientService clientService;

    public ManejadorListarPorIdClient(ClientService clientService) {
        this.clientService = clientService;
    }

    public Optional<Client> ejecutar(int clientId){
        return clientService.findById(clientId);
    }
}
