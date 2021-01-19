package com.agrojm.facturacionelectronica.dominio.servicio;

import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.dominio.repositorio.ProductRepository;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class ProductService {
    private ProductRepository productRepository;

    public ProductService(ProductRepository productRepository){
        this.productRepository=productRepository;
    }

    public List<Product> getAll(){

        return productRepository.getAll();
    }

    public Optional<Product> findById(int productId){

        return productRepository.findById(productId);
    }

    public Product save(Product product){

        return productRepository.save(product);
    }

    public boolean delete(int productId){
        return findById(productId).map(product -> {
            productRepository.delete(productId);
            return true;
        }).orElse(false);
    }

    public Product update (Product product){
        return productRepository.update(product);
    }

    public Optional<List<Product>> findByName(String name){
        return productRepository.findByName(name);
    }
}
