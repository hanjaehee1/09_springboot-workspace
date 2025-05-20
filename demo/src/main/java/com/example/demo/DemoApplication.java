package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {
 // 스프링 부트를 통한 내부 톰캣 실행 메소드
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
