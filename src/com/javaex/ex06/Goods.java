package com.javaex.ex06;

public class Goods {

	//필드
	private String name;
	private int price;
	

	//생성자
	public Goods() { //기본 생성자
		//*****메모리에 올리는일(클래스를 인스턴스화)
		
	}
	
	public Goods(String name) {
		//*****메모리에 올리는일(클래스를 인스턴스화)
		//추가로직
		this.name = name;
	}
	
	//public Goods(int price) {
	//	this.price = price;
	//}
	
	public Goods(String name, int price) {
		//*****메모리에 올리는일(클래스를 인스턴스화)
		//추가로직
		this.name = name;
		this.price = price;
	}
	
	//메소드gs
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}
	//메소드 일반
	public void showinfo() {
		System.out.println("상품이름: "+name);
		System.out.println("상품가격: "+price);
		System.out.println("");
	}
	
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}

}
