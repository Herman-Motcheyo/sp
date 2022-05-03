package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.BuissnessService;

@SpringBootTest
class HellowordApplicationTests {
     @Autowired
	private BuissnessService bs;
     
	@Test
	void contextLoads() {
	}
   
	@Test
	public void getHelloword() {
		String expected = "Helloword herman";
		String result = bs.getHelloword().getValue();
		assertEquals(expected, result);
	}
}
