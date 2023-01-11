package com.godelivery.godelivery.controllers;

import com.godelivery.godelivery.dto.ProductDTO;
import com.godelivery.godelivery.services.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/products")
@Api(value = "API REST Produtos")
@CrossOrigin(origins = "*")
public class ProductController {
    @Autowired
    private ProductService service;

    @GetMapping
    @ApiOperation(value="Retorna todos os produtos paginados")
    public ResponseEntity<Page<ProductDTO>> findAll(Pageable pageable) {
        Page<ProductDTO> page = service.findAll(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping(value = "/{id}")
    @ApiOperation(value="Retorna produto do id informado")
    public ResponseEntity<ProductDTO> findAll(@PathVariable Long id) {
        ProductDTO dto = service.findById(id);
        return ResponseEntity.ok(dto);
    }

}
