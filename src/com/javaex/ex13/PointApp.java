package com.javaex.ex13;

public class PointApp {

	public static void main(String[] args) {
		
	Point p1 = new Point(4,4);
	
	p1.showinfo();
	
	ColorPoint c1 = new ColorPoint("red");
	c1.showinfo();
	
	ColorPoint c2 = new ColorPoint(10,10,"blue");
	c2.showinfo();
	
	}

}
