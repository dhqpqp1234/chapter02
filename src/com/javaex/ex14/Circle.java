package com.javaex.ex14;

public class Circle extends Color {
	//필드
	private int radius;
	//생성자
public Circle() {
		
	}
	
	public Circle(String shapeColor,String lineColor, int radius ) {
		super(shapeColor,lineColor);
		this.radius = radius;
	}
	//메소드gs

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public int getRadius() {
		return radius;
	}

	
	//메소드일반
	
	public void draw() {
		System.out.println("면색:"+super.shapeColor+", 선색:"+super.lineColor+", 반지름:"+this.radius+" 원을 그렸습니다.");
	}
	
}
