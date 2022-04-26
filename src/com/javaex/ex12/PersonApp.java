package com.javaex.ex12;

public class PersonApp {

	public static void main(String[] args) {
		/*
		Person p01 = new Person("정우성", 45);
		p01.showinfo();
		*/
		
		/*
		Student s01 = new Student("서울고등학교");
		System.out.println(s01.toString());
		*/
		/*
		Student s02 = new Student();
		s02.setAge(45);  //부모클래스 메소드 사용가능
		s02.setName("정우성");
		s02.setSchoolNAme("서울고등학교");
		//부모 생성자먼저 생성후 자식생성자
		*/
		
		
		
		Student s03 = new Student("정우성",45,"서울고등학교");
		System.out.println(s03.getName());
		System.out.println(s03.toString());
		s03.showinfo(); // 부모것을 쓰기 싫다면 똑같은 이름으로 만들면 됨
		
		s03.showinfo();//부모의 showinfo를쓰고 모자란부분은 자식으로
	}

}

