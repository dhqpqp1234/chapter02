package com.javaex.ex12;

public class Person {

	//필드
	protected String name;
	protected int age;
	//생성자
	public Person() {
	System.out.println("Person");	
	}
	
	
	public  Person(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("Person2");
	}
	

	
	//메소드gs
	
	public void setName(String name) {
	this.name = name;
		
	}
	
	public void setAge(int age) {
		this.age= age;
			
		}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	
	//메소드일반
	
	
	
	public void showinfo() {
		System.out.println("이름: "+name+", 나이: "+age);
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}
