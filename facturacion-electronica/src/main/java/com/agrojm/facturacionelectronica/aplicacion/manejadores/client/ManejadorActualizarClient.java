package com.agrojm.facturacionelectronica.aplicacion.manejadores.client;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoClient;
import com.agrojm.facturacionelectronica.aplicacion.fabrica.FabricaClient;
import com.agrojm.facturacionelectronica.dominio.modelo.Client;
import com.agrojm.facturacionelectronica.dominio.servicio.ClientService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorActualizarClient {
    private FabricaClient fabricaClient;
    private ClientService clientService;

    public ManejadorActualizarClient(FabricaClient fabricaClient, ClientService clientService) {
        this.fabricaClient = fabricaClient;
        this.clientService = clientService;
    }

    public Client ejecutar(ComandoClient comandoClient, int clientId){
        Client client = fabricaClient.crear(comandoClient);
        return clientService.update(client, clientId);
    }
}
