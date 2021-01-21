package com.agrojm.facturacionelectronica.aplicacion.fabrica;

import com.agrojm.facturacionelectronica.aplicacion.comando.ComandoClient;
import com.agrojm.facturacionelectronica.dominio.modelo.Client;
import org.springframework.stereotype.Component;

@Component
public class FabricaClient {
    public Client crear(ComandoClient comandoClient){
        return new Client(comandoClient.getClientId(), comandoClient.getDocument(), comandoClient.getName(), comandoClient.getLastname(), comandoClient.getAddress(), comandoClient.getEmail(), comandoClient.getPhone(), comandoClient.isActive(), comandoClient.getCreationDate());
    }
}
