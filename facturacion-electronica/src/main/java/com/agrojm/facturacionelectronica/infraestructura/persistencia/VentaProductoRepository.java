package com.agrojm.facturacionelectronica.infraestructura.persistencia;

import com.agrojm.facturacionelectronica.dominio.modelo.SaleProduct;
import com.agrojm.facturacionelectronica.dominio.repositorio.SaleProductRepository;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.crud.VentaProductoCrudRepositorio;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.VentaProducto;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.mapper.SaleProductMapper;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public class VentaProductoRepository implements SaleProductRepository {

    private VentaProductoCrudRepositorio ventaProductoCrudRepositorio;
    private SaleProductMapper saleProductMapper;

    public VentaProductoRepository(VentaProductoCrudRepositorio ventaProductoCrudRepositorio, SaleProductMapper saleProductMapper) {
        this.ventaProductoCrudRepositorio = ventaProductoCrudRepositorio;
        this.saleProductMapper = saleProductMapper;
    }

    @Override
    public SaleProduct save(SaleProduct saleProduct) {
        VentaProducto ventaProducto = saleProductMapper.toVentaProducto(saleProduct);
        return saleProductMapper.toSaleProduct(ventaProductoCrudRepositorio.save(ventaProducto));
    }

    @Override
    public void delete(int saleProductId) {
        ventaProductoCrudRepositorio.deleteById(saleProductId);
    }

    @Override
    public Optional<SaleProduct> findById(int saleProductId) {
        Optional<VentaProducto> ventaProducto = ventaProductoCrudRepositorio.findById(saleProductId);
        return ventaProducto.map(saleProduct -> saleProductMapper.toSaleProduct(saleProduct));
    }
}
