package work1.presentation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public interface Console {
	Scanner sc = new Scanner(System.in);
	
	static void info(Object obj) {
		System.out.println(obj);
	}
	
	static void err(String msg) {
		System.out.println("err" + msg);
	}
	
	private static void inMsg(String msg) {
		System.out.print(msg + "\n>");
	}
	
	static String inStr(String msg, int len) {
		String input = "";
		boolean isgood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isgood = input.matches("[a-zA-Z가-힣0-9{"+len+"}]");
			if(!isgood) Console.err(len + "자 이하의 문자가 아닙니다");
		}while(!isgood);
		
		return input;
	}
	
	static int inNum(String msg) {
		String input = "";
		boolean isgood = false;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine();
			isgood = input.matches("[0-9]+");
			if(!isgood) Console.err("0 이상의 정수가 아닙니다.");
		}while (!isgood);
		
		return Integer.parseInt(input);
	}
	
	static LocalDate inDate(String msg) {
		String input = "";
		LocalDate date = null;
		
		do {
			Console.inMsg(msg);
			input = sc.nextLine().trim();
			
			if(input.length() > 0 ) {
				try {
					date = LocalDate.parse(input, DateTimeFormatter.ISO_DATE);
				} catch(DateTimeParseException e) {}
			}
			if(date == null) Console.err("YYYY-MM-DD 형식으로 쓰세요");
		} while (date ==null);
		
		return date;
	}
}
