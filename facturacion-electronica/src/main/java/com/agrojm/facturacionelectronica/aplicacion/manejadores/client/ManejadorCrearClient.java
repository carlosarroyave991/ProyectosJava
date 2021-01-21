package com.agrojm.facturacionelectronica.aplicacion.manejadores.client;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoClient;
import com.agrojm.facturacionelectronica.aplicacion.fabrica.FabricaClient;
import com.agrojm.facturacionelectronica.dominio.modelo.Client;
import com.agrojm.facturacionelectronica.dominio.servicio.ClientService;
import org.springframework.stereotype.Component;

@Component
public class ManejadorCrearClient {
    private FabricaClient fabricaClient;
    private ClientService clientService;

    public ManejadorCrearClient(FabricaClient fabricaClient, ClientService clientService) {
        this.fabricaClient = fabricaClient;
        this.clientService = clientService;
    }

    public Client ejecutar(ComandoClient comandoClient){
        Client client = fabricaClient.crear(comandoClient);
        return clientService.save(client);
    }
}
