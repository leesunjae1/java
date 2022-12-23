package ch03.home.ex06;

import java.util.Scanner;

public class Adjust {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x = 0;
		double y = 0;
		
		System.out.println("값을 입력하세요.");
		System.out.print(" x : ");
		x = sc.nextDouble();
	
		y = x - x % 1;
		System.out.println(y);
		
	}

}

/* 과제 : % 연산자를 이용해서, 실수값의 소주점 이하를 내림처리하다

실수값은 sc. nextDouble()로 입력한다

x: 3.1492
3.0
*/