package com.agrojm.facturacionelectronica.infraestructura.persistencia.crud;

import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.Venta;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VentaCrudRepositorio extends PagingAndSortingRepository<Venta, Integer> {
}
