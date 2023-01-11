package com.godelivery.godelivery.dto;

import com.godelivery.godelivery.entities.Category;
import com.godelivery.godelivery.entities.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Data
@NoArgsConstructor
public class ProductDTO {

    private Long id;
    private String name;
    private String description;
    private Double price;
    private Double deliveryPrice;
    private Integer preparationTime;
    private List<CategoryDTO> categories = new ArrayList<>();

    public ProductDTO(Product product) {
        setId(product.getId());
        setName(product.getName());
        setDescription(product.getDescription());
        setPrice(product.getPrice());
        setDeliveryPrice(product.getDeliveryPrice());
        setPreparationTime(product.getPreparationTime());

        product.getCategories().stream().map(category -> categories.add(new CategoryDTO(category))).collect(Collectors.toList());
      }

}
