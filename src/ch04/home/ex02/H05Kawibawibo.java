package ch04.home.ex02;

import java.util.Scanner;

public class H05Kawibawibo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int playerchoice = 0;
		int appchoice = 0;
		String choice = "";
		String result = "";

		System.out.print("1.가위, 2.바위, 3.보\n>");
		playerchoice = sc.nextInt();
		appchoice = (int)(Math.random() * 3) + 1;
		
		if(1 <= playerchoice && playerchoice <= 3) {
			result = switch(playerchoice - appchoice) {
			case -2, 1 -> "you win.";
			case -1, 2 -> "you lose.";
			default -> "fair";
			};
			
			choice = switch(playerchoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("you: " + choice);
		
			choice = switch(appchoice) {
			case 1 -> "가위";
			case 2 -> "바위";
			default -> "보";
			};
			System.out.println("you: " + choice);
		}else result = "ERROR] 1, 2, 3 중에서 입력하세요.";
		
		System.out.println("\n" + result);
		
	}				
}

/* 앱과 가위바위보를 하라 게임 결과를 출력하라 
결과는
You win
You lose
Fair
중 하나이다
--
1.가위, 2.바위, 3.보
> 1
You : 가위
Me : 보

You win.
*/