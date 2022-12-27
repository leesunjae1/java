package ch05.home.ex01.case04;

public class User {
	private String userName;
	private int age;
	private String joinDate;

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setAge(int i) {
		this.age = i;
	}
	
	public void setUserDate(String userDate) {
		this.joinDate = userDate;
	}
	
	public String getUserName() {
		return this.userName;
	}
	
	public int getAge() {
		return this.age; 
	}
	
	public String getUserDate() {
		return this.joinDate;
	}
	
}
