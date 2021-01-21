package com.agrojm.facturacionelectronica.dominio.repositorio;

import com.agrojm.facturacionelectronica.dominio.modelo.Sale;

import java.util.List;
import java.util.Optional;

public interface SaleRepository {
    List<Sale> getAll();
    Optional<Sale> findById(int saleId);
    Sale save(Sale sale);
    Sale update(Sale sale);
    void delete(int saleId);
}
