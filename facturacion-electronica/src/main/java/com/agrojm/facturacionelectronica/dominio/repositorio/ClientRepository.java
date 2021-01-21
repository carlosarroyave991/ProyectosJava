package com.agrojm.facturacionelectronica.dominio.repositorio;


import com.agrojm.facturacionelectronica.dominio.modelo.Client;

import java.util.List;
import java.util.Optional;

public interface ClientRepository {
    List<Client> getAll();
    Optional<Client> findById(int clientId);
    Client save(Client client);
    void delete(int clientId);
    Client update(Client client);
    Optional<Client> findByDocument(String document);
}
