package com.javaex.ex04;

public class PointApp {

	public static void main(String[] args) {
	
		Point Coorx = new Point();
		
		Coorx.setCoorx(5);
		Coorx.setCoory(5);
		
		Point Coory = new Point();
		
		Coory.setCoorx(10);
		Coory.setCoory(23);
		
		Coorx.draw();
		Coory.draw();

	}
}