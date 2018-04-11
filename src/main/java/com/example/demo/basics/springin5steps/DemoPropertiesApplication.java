package com.example.demo.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.example.demo.basics.springin5steps.properties.SomeExternalService;
import com.example.demo.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class DemoPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(DemoPropertiesApplication.class);

	public static void main(String[] args) {
		// Application Context
		ApplicationContext applicationContext = SpringApplication.run(DemoPropertiesApplication.class, args);
		SomeExternalService someExternalService = applicationContext.getBean(SomeExternalService.class);

		System.out.println(someExternalService.returnServiceURL());

	}
}
