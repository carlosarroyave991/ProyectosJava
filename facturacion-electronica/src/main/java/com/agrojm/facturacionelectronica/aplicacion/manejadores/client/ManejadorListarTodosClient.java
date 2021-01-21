package com.agrojm.facturacionelectronica.aplicacion.manejadores.client;

import com.agrojm.facturacionelectronica.dominio.modelo.Client;
import com.agrojm.facturacionelectronica.dominio.servicio.ClientService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ManejadorListarTodosClient {
    private ClientService clientService;

    public ManejadorListarTodosClient(ClientService clientService) {
        this.clientService = clientService;
    }

    public List<Client> ejecutar(){
        return clientService.getAll();
    }
}
