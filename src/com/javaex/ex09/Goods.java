package com.javaex.ex09;

public class Goods {
	//필드
	private String name;
	private int price;
	//생성자
	
	public Goods() {
		
	}
	
	public Goods (String name, int price) {
		this.name=name;
		this.price=price;
	}
	
	
	//메소드gs
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getName() {
		return name;
	}

	
	
	//메소드 일반
	
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
		
		
		
	}
	public void showinfo() {
		System.out.println("상품명: "+name+"  가격: "+price);
	}
	
	
}
