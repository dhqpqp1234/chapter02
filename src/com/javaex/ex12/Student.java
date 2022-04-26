package com.javaex.ex12;

public class Student extends Person{

	//필드
	protected String schoolName;
	//생성자
	
	public Student() {
		super();
		System.out.println("Student");
	}
	
	public Student(String schoolName) {
		super();
		this.schoolName = schoolName;
		System.out.println("Student1");
	}

	public Student(String name, int age, String schoolName) {
		super(name, age);
		this.schoolName = schoolName;
		System.out.println("Student3");
	}

	//메소드 gs
	
	public void setSchoolNAme(String schoolName) {
		this.schoolName = schoolName;
	}
	
	public String getSchoolName() {
		return schoolName;
	}


	
	//메소드 일반
	//부모꺼 쓰기싫을때 이름 같이해서 덮어쓰기
	//public void showinfo() {
	//System.out.println("*이름:"+name+"*나이:"+age+"*학교:"+schoolName);	
	//}
	
	//부모껄 출력하고 모자란것만 보충하고싶을때
	public void showinfo() {
	super.showinfo(); // super을 사용하여 부모와 자식을 구분하여 작성
		System.out.println("학교:"+this.schoolName);
	}
	
	@Override
	public String toString() {
		return "Student [schoolName=" + name + ", getName()=" + super.getName() + ", getAge()=" + getAge() + "]";
	}

	
	
	
}
