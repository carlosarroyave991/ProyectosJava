package com.agrojm.facturacionelectronica.infraestructura.persistencia.crud;

import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.Producto;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.List;

public interface ProductoCrudRepositorio extends CrudRepository<Producto, Integer> {
    Optional<List<Producto>> findByNombre(String nombre);
}
