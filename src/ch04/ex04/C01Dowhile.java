package ch04.ex04;

import java.util.Scanner;

public class C01Dowhile {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int result = 0;
		
		do {
			System.out.print("a: ");
			a= sc.nextInt();
			
			System.out.print("b: ");
			b= sc.nextInt();
			
			System.out.printf("%d + %d = %d\n", a, b, result = a + b);
		} while(result != 0);
	}
}
// dowhile은 1회이상 반복할때 쓴다 조건문이 뒤에 있어서 가능하다