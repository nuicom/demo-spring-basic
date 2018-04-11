package com.example.demo.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class DemoBasicApplication {

	//What are the beans?
	//What are the dependencies of a bean?
	//Where to search for beans?
	
	
	public static void main(String[] args) {
//		BinarySearchImpl binarySearchImpl = new BinarySearchImpl(new QuickSortAlgorithm());
		
		//Application Context
		ApplicationContext applicationContext = SpringApplication.run(DemoBasicApplication.class, args);
		BinarySearchImpl binarySearchImpl = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearchImpl2 = applicationContext.getBean(BinarySearchImpl.class);

		System.out.println(binarySearchImpl == binarySearchImpl2);
		int result = binarySearchImpl.binarySearch(new int[] {1,2,3}, 3);
		System.out.println(result);
	}
}
