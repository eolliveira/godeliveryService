package com.godelivery.godelivery.services;

import com.godelivery.godelivery.dto.ProductDTO;
import com.godelivery.godelivery.entities.Product;
import com.godelivery.godelivery.repositories.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;
    @Transactional
    public Page<ProductDTO> findAll(Pageable pageable) {
        Page<Product> list = repository.findAll (pageable);
        return list.map(ProductDTO::new);
    }

    @Transactional
    public ProductDTO findById(Long id) {
        Optional<Product> opt = repository.findById(id);
        Product product = opt.orElseThrow(() -> new RuntimeException("teste"));
        //TODO(lançar exeception corretamente)
        return new ProductDTO(product);
    }
}
