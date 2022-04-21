package com.javaex.ex03;

public class GoodsApp {

	public static void main(String[] args) {
		//생성자
		
		//메소드-gs      n(임시)은 스트링 입력값 담을그릇
		
		//메소드 = 일반
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setprice(400000);
		
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		computer.setprice(900000);
		
		Goods cup = new Goods();
		
		cup.setName("머그컵");
		cup.setprice(2000);
		
		camera.showinfo();
		computer.showinfo();
		cup.showinfo();
	}

}
