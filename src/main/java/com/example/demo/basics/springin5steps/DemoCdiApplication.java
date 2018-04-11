package com.example.demo.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basics.springin5steps.cdi.SomeCdiBusiness;
import com.example.demo.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class DemoCdiApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DemoCdiApplication.class);
	
	public static void main(String[] args) {		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(DemoCdiApplication.class, args);
		SomeCdiBusiness someCdiBusiness = applicationContext.getBean(SomeCdiBusiness.class);

	
		LOGGER.info("{} dao-{}",someCdiBusiness,someCdiBusiness.getSomeCdiDao());
		
				
		

	}
}
