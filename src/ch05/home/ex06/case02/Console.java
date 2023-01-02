package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);  //static 초기화 방법이다
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}	
		
	public static String inStr(String msg) {
		String input = "";
		boolean isgood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isgood = input.matches("[a-zA-Z가-힣]+");
			if(!isgood) Console.err("문자가 아닙니다");
		}while(!isgood);
		
		return input;	
	}
		
	public static int inNum(String msg) {
		String input = "";
		boolean isgood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine(); // ^ ~시작 * ~끝 표시 
			isgood = input.matches("^[1-9][0-9]*"); //10의자리[1-9] 1의자리[0-9] 표시
			if(!isgood) Console.err("자연수가 아닙니다.");
		}while(!isgood);
	
		return Integer.parseInt(input);
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
			
	public static void err(String msg) {
		System.out.println("ERROR]"+ msg);
			
	}	
}
