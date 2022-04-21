package com.javaex.ex04;

public class Point {
	private int x;
	private int y;
	
	public void setCoorx(int n) {
		  x = n;
	}
	
	public void setCoory(int p) {
		y = p;
	}
	
	public int getCoorx () {
		return x;
	}
	
	public int getCoory() {
		return y;
	}
	
	public void drawinfo() {
		System.out.println("점[x="+x+", y"+"="+y+"]을 그렸습니다.");
	}
	
}
