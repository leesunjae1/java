package ch07.ex07.case03;

public class Main {
	public static void main(String[] args) {
		Calculator calculator = (int x, int y) -> {
			int result = x + y;
			return result;
		};
		//두개이상 명령문 쓸땐 괄호 안에 써준다
		calculator = (a, b) -> a + b;
		
		System.out.println(calculator.calc(1, 2));
	}
}
