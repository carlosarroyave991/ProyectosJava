package com.agrojm.facturacionelectronica.infraestructura.persistencia.mapper;


import com.agrojm.facturacionelectronica.dominio.modelo.Product;
import com.agrojm.facturacionelectronica.infraestructura.persistencia.entidades.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    @Mappings({
            @Mapping(source = "id", target = "productId"),
            @Mapping(source = "codigo", target = "code"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "fechaCreacion", target = "creationDate", expression = "java(new java.util.Date())"),
    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);

    @InheritInverseConfiguration
    Producto toProducto(Product product);
}
