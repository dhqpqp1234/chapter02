package com.javaex.ex14;

public class ColorApp {

	public static void main(String[] args) {
		
	
	Color 	ColorSl = new Color();
	
	Ractangle ract = new Ractangle("빨강", "검정", 4, 4);
	Ractangle ract1 = new Ractangle("주황", "검정", 5, 5);
	
	Triangle tri = new Triangle("빨강", "검정", 4, 4);
	Triangle tri1 = new Triangle("보라", "검정", 10, 10);
	
	Circle 	cir = new Circle("보라", "빨강", 3);
	Circle 	cir1 = new Circle("보라", "검정", 3);
	
	ract.draw();
	ract1.draw();
	
	tri.draw();
	tri1.draw();
	
	cir.draw();
	cir1.draw();
	
	
	Color[] ractangles = new Color[2]; 
	ractangles[0] = ract;
	ractangles[1] = ract1;
	
	Color[] triangle = new Color[2];
	triangle[0] = tri;
	triangle[1] = tri1;
	
	Color[] circle = new Color[2];
	circle[0] = cir;
	circle[1] = cir1;
	
}
}