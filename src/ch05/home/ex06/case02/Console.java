package ch05.home.ex06.case02;

import java.util.Scanner;

public class Console {
	
	static boolean isgood = false;
	String tmp = "";
	private static Scanner sc;
	
	static {
		sc = new Scanner(System.in);  //static 초기화 방법이다
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n> ");
	}	
		
	public static String inStr(String msg) {
		do {
			Console.inMsg(msg);
			msg = sc.nextLine().trim();
		
			isgood = msg.matches("[0-9]+");
			if(!isgood) System.out.println("문자가아닙니다.");
			}while(!isgood);
		
	}
		
	public static int inNum(String msg) {
		Console.inMsg(msg);
		int num = sc.nextInt(); sc.nextLine();
		return num;
	}
	
	public static void info(String msg) {
		System.out.println(msg);
	}
			
	public static void err(String msg) {
		System.out.println("ERROR]"+ msg);
			
	}	
}
