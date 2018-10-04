package com.secondgroup.web.cloudmusicweb;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration;

@EnableAutoConfiguration(exclude = {MultipartAutoConfiguration.class})
@MapperScan("com.secondgroup.web.cloudmusicweb.mapper")
@SpringBootApplication
public class CloudmusicwebApplication {

	public static void main(String[] args) {
		SpringApplication.run(CloudmusicwebApplication.class, args);
	}
}
