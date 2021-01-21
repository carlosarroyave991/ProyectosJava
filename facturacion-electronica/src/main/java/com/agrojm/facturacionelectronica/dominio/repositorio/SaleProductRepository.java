package com.agrojm.facturacionelectronica.dominio.repositorio;

import com.agrojm.facturacionelectronica.dominio.modelo.SaleProduct;

import java.util.Optional;

public interface SaleProductRepository {
    SaleProduct save(SaleProduct saleProduct);
    void delete(int saleProductId);
    Optional<SaleProduct> findById(int saleProductId);
}
