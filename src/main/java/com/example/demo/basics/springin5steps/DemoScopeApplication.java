package com.example.demo.basics.springin5steps;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basics.springin5steps.scope.PersonDAO;

@SpringBootApplication
public class DemoScopeApplication {
	
	private static Logger LOGGER = LoggerFactory.getLogger(DemoScopeApplication.class);
	
	public static void main(String[] args) {		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(DemoScopeApplication.class, args);
		PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

		PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
		
		LOGGER.info("{}",personDao);
		LOGGER.info("{}",personDao.getJdbcConnection());
		
		LOGGER.info("{}",personDao2);
		LOGGER.info("{}",personDao2.getJdbcConnection());
		
		
		System.out.println(personDao.getJdbcConnection() == personDao2.getJdbcConnection());
		
		

	}
}
