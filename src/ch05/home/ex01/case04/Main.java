package ch05.home.ex01.case04;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		User user = new User();
		LocalDate date = LocalDate.now();
		
		System.out.print("이름: ");
		user.setUserName(sc.nextLine());
		
		System.out.print("나이: ");
		user.setAge(sc.nextInt());
		System.out.println();
		
		System.out.printf("이름: %s\n", user.getUserName());
		System.out.printf("나이: %s\n", user.getAge());
		System.out.println(date);
  }
}

/*
사용자를 생성하라
user가 user의 이름, 나이를 입력한다.
app이 user의 가입일을 입력한다
--

이름 : gambit
나이 : 25

이름 : gambit
나이 : 25
가입일 : 2022-12-27
*/