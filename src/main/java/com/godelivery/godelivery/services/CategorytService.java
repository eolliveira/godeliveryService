package com.godelivery.godelivery.services;

import com.godelivery.godelivery.dto.CategoryDTO;
import com.godelivery.godelivery.entities.Category;
import com.godelivery.godelivery.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CategorytService {
    @Autowired
    private CategoryRepository repository;

    @Transactional
    public Page<CategoryDTO> findAll(Pageable pageable) {
        Page<Category> list = repository.findAll(pageable);
        return list.map(CategoryDTO::new);
    }

}
