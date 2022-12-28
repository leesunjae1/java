package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		String userName = "";
		int age = 0;
		LocalDate regDate = null;
		
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		boolean isgood = false;
		

		do {
		System.out.print("이름: ");
		userName = sc.nextLine();
		isgood = userName.matches("[a-zA-A가-힣]+");
		if(!isgood) System.out.println("이름");
		}while(!isgood);
	
		do {
			isgood = false;
		System.out.print("나이: ");
		tmp = sc.nextLine();
		isgood = tmp.matches("[0-9]+");
		if(isgood) age = Integer.parseInt(tmp);
		else System.out.println("나이");
		}while(!isgood);
		
		regDate = LocalDate.now();
		
		User user = new User();
		user.setUserName(userName);
		user.setAge(age);
		user.setRegDate(regDate);
		
		System.out.printf("\n이름: %s\n나이: %d\n가입일: %s",
				user.getUserName(), user.getAge(), user.getRegDate());


  }
}

/*
사용자를 생성하라
user가 user의 이름, 나이를 수동 입력한다.
app이 user의 가입일을 자동입력한다
--

이름 : gambit
나이 : 25

이름 : gambit
나이 : 25
가입일 : 2022-12-27
*/