package com.sf;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.sf.mapper")
public class MybatisCommonApplication {

	public static void main(String[] args) {
		SpringApplication.run(MybatisCommonApplication.class, args);
	}
}
