package com.example.demo.product;

import java.util.HashMap;
import java.util.Map;

@org.springframework.stereotype.Repository
public class ProductRepository {

    private Map<Integer, Product> db = new HashMap<>();
    private int id = 1;

    public Product findProduct(int id) {
        return db.get(id);
    }

    //상품 등록 DB 대체 Dao
    public void save(Product product) {
        //Controller 부터 시작에서 쿼리스트림으로 받은 키워드를 이용해서 DB에서 정보 조회 후 return 해준다
        db.put(id++, product);
        System.out.println(product.getName());
    }
}