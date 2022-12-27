package ch04.home.ex04;

import java.util.Scanner;

public class H02Calculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		String op = "";
		int result = 0;
		
		String tmp = "";
		boolean isgood = false;
		String errMsg = "input 0 or natural number.";
		
		do {
			do {
				isgood = false;
				System.out.print("a: "); tmp = sc.nextLine();
				isgood = tmp.matches("[0-9]+");    //한글자 이상은 +붙여준다
				if(isgood) a = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			}while(!isgood);
			
			do {
				isgood = false;
				System.out.print("op: "); op = sc.nextLine();
				isgood = op.matches("[+-/\\*]"); // regular *을 정규식 바꾸기위해 \\를 썻다
				if(!isgood) System.out.println("input one of them(+,-,*,/).");
			}while(!isgood);
			
			do {
				isgood = false;
				System.out.print("b: "); tmp = sc.nextLine();
				isgood = tmp.matches("[0-9]+");    //한글자 이상은 +붙여준다
				if(isgood) b = Integer.parseInt(tmp);
				else System.out.println(errMsg);
			}while(!isgood);
			
			result = switch(op) {
			case "+" -> a + b;
			case "-" -> a - b;
			case "*" -> a * b;
			default -> a / b;
			};
			
			System.out.printf("%d %s %d = %d\n", a, op, b, result);
			
			System.out.println("continue(y/n)? ");
		} while(sc.nextLine(). equalsIgnoreCase("y"));
		
		System.out.println("end.");
	}
}

/*
계산기를 만들어라
연산자는 +, -, *, / 이다
/ 는 몫만을 구한다
 입력값 a,b는 0또는 자연수이다

 continue(y/n)? 에서 y 또는 Y를 입력하면 계산 작업을 재수행한다
 y 또는 Y 외를 입력하면 앱을 종료한다.+
 
 
--
a : 1
op : +
b : 2
1 + 2 = 3
continue(y/n)? y
a : 2
op : *
b : 2
2 * 2 = 4
continue(y/n)? n
end
*/