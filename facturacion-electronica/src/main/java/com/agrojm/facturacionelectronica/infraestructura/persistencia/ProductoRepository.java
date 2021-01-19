package com.agrojm.facturacionelectronica.infraestructura.persistencia;


import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.dominio.repositorio.ProductRepository;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.crud.ProductoCrudRepositorio;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.Producto;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository {
    private ProductoCrudRepositorio productoCrudRepositorio;
    private ProductMapper productMapper;

    public ProductoRepository(ProductoCrudRepositorio productoCrudRepositorio, ProductMapper productMapper){
        this.productoCrudRepositorio = productoCrudRepositorio;
        this.productMapper = productMapper;
    }

    @Override
    public List<Product> getAll(){
        List<Producto> productos = (List<Producto>) productoCrudRepositorio.findAll();
        return productMapper.toProducts(productos);
    }

    @Override
    public Optional<Product> findById(int productId) {
        Optional<Producto> producto = productoCrudRepositorio.findById(productId);
        return producto.map(prod -> productMapper.toProduct(prod));
    }

    @Override
    public Product save(Product product) {
        Producto producto = productMapper.toProducto(product);
        return productMapper.toProduct(productoCrudRepositorio.save(producto));
    }

    @Override
    public void delete(int productId) {
        productoCrudRepositorio.deleteById(productId);
    }

    @Override
    public Product update(Product product) {
        Producto producto = productMapper.toProducto(product);
        return productMapper.toProduct(productoCrudRepositorio.save(producto));
    }

    @Override
    public Optional<List<Product>> findByName(String name){
        Optional<List<Producto>> productos = productoCrudRepositorio.findByNombre(name);
        return productos.map(prod -> productMapper.toProducts(prod));
    }
}
