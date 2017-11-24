package com.cbw;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class MySringBootMybatis2Application {

	public static void main(String[] args) {
		SpringApplication.run(MySringBootMybatis2Application.class, args);
	}
}
