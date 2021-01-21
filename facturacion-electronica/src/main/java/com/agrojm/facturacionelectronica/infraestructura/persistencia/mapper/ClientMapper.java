package com.agrojm.facturacionelectronica.infraestructura.persistencia.mapper;

import com.agrojm.facturacionelectronica.dominio.modelo.Client;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.Cliente;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClientMapper {
    @Mappings({
            @Mapping(source = "id", target = "clientId"),
            @Mapping(source = "documento", target = "document"),
            @Mapping(source = "nombres", target = "name"),
            @Mapping(source = "apellidos", target = "lastname"),
            @Mapping(source = "direccion", target = "address"),
            @Mapping(source = "telefono", target = "phone"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "fechaCreacion", target = "creationDate"),
    })
    Client toClient(Cliente cliente);
    List<Client> toClients(List<Cliente> clientes);

    @InheritInverseConfiguration
    @Mapping(target = "ventas", ignore = true)
    Cliente toCliente(Client client);
}
