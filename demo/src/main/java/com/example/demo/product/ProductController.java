package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody
public class ProductController {

    @Autowired
    private ProductService productService;

    //상품 조회
    // 입력 받은 값을 id라는 변수에 담음
    @RequestMapping(value="/products/{id}", method = RequestMethod.GET)
    public Product findProduct(@PathVariable("id") int id) {
        System.out.println(id);
        return productService.findProduct(id);
    }

    //상품 등록 컨트롤러
    //등록의 경우 method로 post 를 사용
    //쿼리스트림 방식으로 name
    @RequestMapping(value="/products", method = RequestMethod.POST)
    @ResponseBody
    public void saveProduct(@RequestBody Product product) {
        // http://localhost:8081/products?name=handcream 으로 요청을한다면
        // String productName = "handcream"
        System.out.println("POST");
        productService.saveProduct(product);
    }
}