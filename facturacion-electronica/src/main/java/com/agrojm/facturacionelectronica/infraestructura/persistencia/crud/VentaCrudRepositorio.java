package com.agrojm.facturacionelectronica.infraestructura.persistencia.crud;

import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.Venta;
import org.springframework.data.repository.CrudRepository;

public interface VentaCrudRepositorio extends CrudRepository<Venta, Integer> {
}
