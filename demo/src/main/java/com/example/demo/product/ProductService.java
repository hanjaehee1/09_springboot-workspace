package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product findProduct(int id) {
        return productRepository.findProduct(id);
    }

    //상품 등록 서비스 메소드
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

}