package ch05.ex08.case01;

public class Baby {
	private String babyName;
	
	public Baby() {}
	
	public Baby(String babyName) {
		this.babyName = babyName; //객체생성 직후에 멤버변수를 쓴다 new로 콜한다
	}
	
	public void setBabyName(String babyName) {
		this.babyName = babyName; //객체생성 후에 멤버변수 를 초기화한다
	}
}
