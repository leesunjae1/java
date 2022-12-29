package ch05.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(1, 2);
		result = calculator.add(1, 2, 3);
		
		System.out.println(result);
	}
}

// 누가 콜한걸까? 메인메서드가 콜한것이다.