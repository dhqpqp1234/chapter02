package com.javaex.ex14;

public class Color {
	//필드
	protected String shapeColor;
	protected String lineColor ;
	//생성자
	public Color() {
		
	}
	
	public Color(String shapeColor, String lineColor ) {
		this.shapeColor = shapeColor;
		this.lineColor = lineColor;
	}
	//메소드 gs
	
	public void setShape(String shapeColor) {
		this.shapeColor = shapeColor;
	}
	
	public void setLine(String lineColor) {
		this.lineColor = lineColor;
	}
	
	public String getShape() {
		return shapeColor;
	}

	
	public String getLine() {
		return lineColor;
	}

	
	
	//메소드일반
	
	public void showinfo() {
		System.out.println("면색: "+shapeColor+", 선색:"+ lineColor);
	}
	
}
