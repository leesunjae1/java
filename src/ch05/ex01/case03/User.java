package ch05.ex01.case03;

public class User {
	private String userName; //encapsulation 캡슐화, 캡슐로 둘러쌓다
	private int age;
	
	public void setUserName(String userName) {   //리턴값이 없다를 void로 표현한다
		this.userName = userName;
	}         
	           //쓰기할때는 set을 쓴다.
	public void setAge(int age) {
		this.age = age;
	}
	           // 읽기할때는 get을 쓴다.
	public String getUserName() {
		return this.userName;
	}
	
	public int getAge() {
		return this.age; 
		//위 명령문들을 accessor(접근자) 라고 한다
	}
}


// this는 user타입의 객체가 담긴다. 그러므로 this의 타입은 user이다.

