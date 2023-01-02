package ch05.ex08.case01;

public class Main {
	public static void main(String[] args) {
		Baby baby = new Baby();
		baby.setBabyName("초롱이");//태어나서 이름을 지어준 경우
		
		baby = new Baby("튼튼이");//태어나기 전에 이름을 갖고있는 경우
	}
}
