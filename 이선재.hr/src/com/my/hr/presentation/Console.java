package com.my.hr.presentation;

import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	int WORKER_LIST = 1;
	int WORKER_ADD = 2;
	int WORKER_FIX = 3;
	int WORKER_DEL = 4;
	int WORKER_EXIT = 5;
	
	
	private static void inMsg(String msg) {
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
	
	public static void err(String msg) {
		System.out.print("ERROR]" + msg);
	}
}
