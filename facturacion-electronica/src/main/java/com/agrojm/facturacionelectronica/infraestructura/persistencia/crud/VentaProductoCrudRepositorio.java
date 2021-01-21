package com.agrojm.facturacionelectronica.infraestructura.persistencia.crud;

import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.VentaProducto;
import org.springframework.data.repository.CrudRepository;

public interface VentaProductoCrudRepositorio extends CrudRepository<VentaProducto, Integer> {
}
