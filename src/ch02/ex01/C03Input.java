package ch02.ex01;

import java.util.Scanner;

public class C03Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("문자열을 입력하세요.\n> ");
		
		sc.nextLine();
		System.out.print("입력했습니다.");
		*/
		/*
		String str = sc.nextLine();
		System.out.printf("%s을 입력했습니다.",str);
		*/
		/*
		System.out.print("숫자를 입력하세요.\n> ");
		int i = sc.nextInt();
		System.out.println(i + "을 입력했습니다.");
		
		System.out.print("숫자를 입력하세요.\n> ");
		i = sc.nextInt(); sc.nextLine();
		System.out.println(i + "을 입력했습니다.");
		
		System.out.print("문자열을 입력하세요.\n> ");
		String str = sc.nextLine();
		System.out.println(str + "을 입력했습니다.");
		*/
		
		System.out.print("문자를 입력하세요.\n ");
		char c = sc.nextLine().charAt(0);
		System.out.println(c + "를 입력했습니다. ");
		
	}	
}