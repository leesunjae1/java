package ch04.home.ex05;

public class H02_369 {
	public static void main(String[] args) {
		int tens = 0;
		int ones = 0;
		
		for(int i = 1; i <= 99; i++) {
			tens = i / 10;
			ones = i % 10;
			
			System.out.print(" " + i);
			if(tens != 0&& tens % 3 ==0) System.out.print("짝");				
			if(ones != 0&& ones % 3 ==0) System.out.print("짝");	
			
			if(i % 10 ==0) System.out.println();	
		}	
	}
}
/* 369 게임을 하라
숫자는 1 이상 99 이하이다
10단위로 새로운 줄에 출력하라
*/