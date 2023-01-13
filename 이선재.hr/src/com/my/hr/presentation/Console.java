package com.my.hr.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
		
	
	public static void inMsg(String msg) {
		System.out.print(msg + " : ");
	}
	
	public static String inStr(String msg) {
		String input = "";
		boolean isGood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isGood = input.matches("[a-zA-Z가-힣] + 5");
			if(!isGood) Console.err("다시 입력하세요.");
		}while(!isGood);
		return input;
	}
	
	public static void info(Object obj) {
		System.out.println(obj);
	}
	public static void err(String msg) {
		System.out.print("ERROR]" + msg);
	}
}