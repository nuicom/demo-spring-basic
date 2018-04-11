package com.example.demo.basics.springin5steps.basic;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.basics.springin5steps.DemoBasicApplication;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes=DemoBasicApplication.class)
public class BinarySearchTest {

	//Get this bean from the context
	@Autowired
	BinarySearchImpl binarySearchImpl;
	
	@Test
	public void testBasicScenario() {
		int actualResult = binarySearchImpl.binarySearch(new int[]{}, 5);
		assertEquals(3, actualResult);
		//call method on binarySearch
		//check if the value is correct
		
	}

}
