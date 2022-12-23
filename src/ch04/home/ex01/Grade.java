package ch04.home.ex01;

import java.util.Scanner;

public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int score = 0;
		String grade = "";
		
		System.out.print("점수 : ");
		score = sc.nextInt();
		
		
		if(score >= 98) { 
			
		}
		else {
			if(score >= 80) {
				grade = score >= 88 ? "B+" : (score >= 84 ? "B" : "B-");
			}else {
				grade = "C";
			}
		}
		//char b = 'b';
		//if('a' < b && b < 'c') System.out.println("good."); 
		System.out.print(grade);
	}
}

/*
다음 구간별로 학점을 부여하라.
98 이상 A+
94 이상 A
90 이상 A-
88 이상 B+
84 이상 B
80 이상 B-
80 미만 C
--

점수:100
A+
*/