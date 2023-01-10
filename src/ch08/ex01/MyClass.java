package ch08.ex01;

@Universal
@Type(name="class", value=1)
public class MyClass {
	@Field(1) @Universal  //기본이름일 경우 속성명이 생략 가능하다 (value 생략함)
	private String myName;
	
	@Constructor
	public MyClass() {}
	
	@Method
	public void play(@Param String userName, @Param int age) {
		@Local int i = 0;
	}
}