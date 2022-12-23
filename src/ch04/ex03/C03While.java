package ch04.ex03;

public class C03While {
	public static void main(String[] args) {
		int calorie = 0;
		int food = 0;
		
		while(calorie < 30) {
			food = (int)(Math.random() * 10) + 1;
			 // n의 나머지가 0이면 n의 배수이다
			if(food % 5 ==0) { //상한음식을 5의 배수로 정한것이다
				System.out.println("상한 음식을 뱉다.");
				break;
			}
			calorie += food;
		}
		System.out.println(calorie + "cal.만큼 먹었습니다.");
	}
}