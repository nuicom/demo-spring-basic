package com.example.demo.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.example.demo.basics.componentscan.ComponentDAO;
import com.example.demo.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
@ComponentScan("com.example.demo.basics.componentscan")
public class DemoComponentScanApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DemoComponentScanApplication.class);
	
	public static void main(String[] args) {		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(DemoComponentScanApplication.class, args);
		ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

		ComponentDAO componentDAO2 = applicationContext.getBean(ComponentDAO.class);
		
		LOGGER.info("{}", componentDAO);
		LOGGER.info("{}",componentDAO.getJdbcConnection());
		
		LOGGER.info("{}",componentDAO2);
		LOGGER.info("{}",componentDAO2.getJdbcConnection());
		
		
		System.out.println(componentDAO.getJdbcConnection() == componentDAO2.getJdbcConnection());
		
		

	}
}
