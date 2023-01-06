package com.godelivery.godelivery.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CategoryDTO implements Serializable {

    private Long id;
    private String name;
}
