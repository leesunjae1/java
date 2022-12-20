package ch02.ex01;

public class C02Output {
	public static void main(String[] args) {
		int score = 100;
		System.out.println(100); // parameter(100을 가르킴)
		System.out.println(score);
		System.out.println(100 + 1); //expression (수식)
		System.out.println(Math.random()); //method (random을 가르킴)
		
		System.out.print(200);
		System.out.print(300);
		System.out.print('\n'); // 엔터키를 눌렀을때 표현되는 특수문자
		System.out.print(400);
		System.out.println();
		
		System.out.printf("%b %c %d %f %s\n", true, 'a', 10, 1.15, "hello"); //separator 스페이스문자를 빈칸으로 표현한다
		System.out.printf("%b/%c/%d/%f/%s\n",true,'a',10,1.15,"hello");
		
		System.out.printf("%5b|%-5c|%5d|%5.2f|%5s\n", true, 'a', 10, 1.156, "hello");
		
		String name = "최한석";
		int age = 22;
		System.out.printf("%s %d", name, age);
		System.out.printf("\n%s은 %d살입니다.", name, age);
		System.out.println();
		System.out.println(name + "은 " + age + "살입니다."); //snippet , concatenate(붙히기 +)
	}
}