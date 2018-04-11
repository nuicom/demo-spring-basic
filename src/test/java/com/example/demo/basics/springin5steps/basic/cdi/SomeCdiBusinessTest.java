package com.example.demo.basics.springin5steps.basic.cdi;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.basics.springin5steps.DemoBasicApplication;
import com.example.demo.basics.springin5steps.cdi.SomeCdiBusiness;
import com.example.demo.basics.springin5steps.cdi.SomeCdiDao;

//Load the context
@RunWith(MockitoJUnitRunner.class)
public class SomeCdiBusinessTest {

	@InjectMocks
	SomeCdiBusiness business;
	
	@Mock
	SomeCdiDao daoMock;
	
	@Test
	public void testBasicScenario() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,4});
		assertEquals(4,  business.findGreatest());
	}
	
	@Test
	public void testBasicScenario_NoElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {});
		assertEquals(Integer.MIN_VALUE,  business.findGreatest());
	}

	@Test
	public void testBasicScenario_EqualElements() {
		Mockito.when(daoMock.getData()).thenReturn(new int[] {2,2});
		assertEquals(2,  business.findGreatest());
	}

}
