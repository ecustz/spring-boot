package com.example.demo;

import java.io.Serializable;

public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6740360410797897121L;

	private String name;
	
	private Integer age;
	
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return this.name+"-"+this.age;
	}
}
