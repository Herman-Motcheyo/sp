package com.example.demo.service;

import org.springframework.stereotype.Component;

import com.example.demo.model.HelloWord;

@Component
public class BuissnessService {


	public HelloWord getHelloword() {
		HelloWord h = new HelloWord();
		return h;

	}
}
