package com.java.lastest;

public class Trainer {

	public Trainer() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Trainer(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	private String name;
	private int age;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", age=" + age + "]";
	}
	
	
}
