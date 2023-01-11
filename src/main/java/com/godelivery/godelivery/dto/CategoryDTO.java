package com.godelivery.godelivery.dto;

import com.godelivery.godelivery.entities.Category;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CategoryDTO implements Serializable {

    private Long id;
    private String name;

    public CategoryDTO(Category category) {
        setId(category.getId());
        setName(category.getName());
    }

}
