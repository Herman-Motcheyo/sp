package com.example.demo.model;

public class HelloWord {
	private String value = "Helloword herman";

	@Override
	public String toString() {

		return value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}
