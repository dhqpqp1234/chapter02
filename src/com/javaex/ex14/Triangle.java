package com.javaex.ex14;

public class Triangle extends Color {

	//필드
	private int width;
	private int height;
	//생성자
public Triangle() {
		
	}
	
	public Triangle(String shapeColor,String lineColor, int width, int height ) {
		super(shapeColor,lineColor);
		this.width = width;
		this.height = height;
	}
	//메서드 gs

	public void setHeight(int height) {
		this.height = height;
	}
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	
	//메서드 일반
	
	public void draw() {
		System.out.println("면색:"+super.shapeColor+", 선색:"+super.lineColor+", 가로:"+this.width+", 세로:"+this.height+" 삼각형을 그렸습니다.");
	}
	
}
