package ch05.home.ex02.case02;

import java.time.LocalDate;
import java.util.Scanner;

import ch05.ex02.case02.Board;

public class Main {
	public static void main(String[] args) {
		Paper paper = new Paper();
		String msg = "";
		String writerName = "";
		
		Scanner sc = new Scanner(System.in);
		boolean isgood = false;
		
		do {
		System.out.print("메세지: ");
		msg = sc.nextLine();
		isgood = msg.matches("[a-zA-Z가-힣]+");
		if(isgood) paper.setMsg(msg);
		else System.out.println("ERROR] 메세지를 입력하세요.");
		} while(!isgood);
		
		isgood = false;
		do {
			System.out.print("작성자명: ");
			writerName = sc.nextLine();
			isgood = writerName.matches("[a-zA-Z가-힣]+");
			if(isgood) paper.setWriterName(writerName);
			else System.out.println("ERROR] 작성자명을 입력하세요.");
		} while(!isgood);
		
		System.out.printf("\n%s from %s", paper.getMsg(), paper.getWriterName());
	}
}
/*
종이에 메세지와 작성자명을 기록하라

--
메세지: hello
작성자명: terry

hello from terry
*/