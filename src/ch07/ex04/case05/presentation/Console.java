package ch07.ex04.case05.presentation;

import java.util.Scanner;

	public interface Console {
		Scanner sc = new Scanner(System.in);
			
		private static void inMsg(String msg) {
			System.out.print(msg + ":");
		}
		
		public static String inStr(String msg) {
			String input = "";
			boolean isgood = false;
			
			do {
				Console.inMsg(msg);
				input = sc.nextLine();
				isgood = input.matches("[a-zaA-Z가-힣]");
				if(!isgood) Console.err("문자가 아닙니다.");
			}while(!isgood);
			return input;
		}
		
		public static int inNum(String msg) {
			String input = "";
			boolean isgood = false;
			
			do {
				Console.inMsg(msg);
				input = sc.nextLine();
				isgood = input.matches("[0-9]+");
				if(!isgood) Console.err("0 이상의 정수가 아닙니다.");
			}while(!isgood);
			return 0;
		}
		
		public static void info(Object obj) {
			System.out.println(obj);
	}
	
		public static void err(String msg) {
			System.out.print("ERROR] " + msg);

			
	}
}
