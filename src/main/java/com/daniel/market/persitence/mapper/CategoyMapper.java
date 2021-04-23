package com.daniel.market.persitence.mapper;

import com.daniel.market.domain.Category;
import com.daniel.market.persitence.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface CategoyMapper {
//Convertimos categoria en category
    @Mappings({
            @Mapping(source = "idCategoria",target = "categoyId"),
            @Mapping(source = "descripcion",target = "category"),
            @Mapping(source = "estado",target = "active"),

             })
    Category toCategoy(Categoria categoria);

    //hace el mapeo inverso al que ya tenemos
    @InheritInverseConfiguration
    @Mapping(target = "productos",ignore = true)
    Categoria toCategoria(Category category);
}
