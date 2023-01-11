package com.godelivery.godelivery.controllers;

import com.godelivery.godelivery.dto.CategoryDTO;
import com.godelivery.godelivery.services.CategorytService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {
    @Autowired
    private CategorytService service;

    @GetMapping
    public ResponseEntity<Page<CategoryDTO>> findAll(Pageable pageable) {
        Page<CategoryDTO> page = service.findAll(pageable);
        return ResponseEntity.ok(page);
    }
}
