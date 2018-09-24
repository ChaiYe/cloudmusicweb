package com.secondgroup.web.cloudmusicweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.secondgroup.web.cloudmusicweb.mapper")
@SpringBootApplication
public class CloudmusicwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudmusicwebApplication.class, args);
	}
}
