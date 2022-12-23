package ch04.ex01;

public class C04Condition {
	public static void main(String[] args) {
		int a = 3;
		if(0 < a && a < 4) System.out.println("good."); 
		
		// b값이 'a' 초과 'c'미만 범위에 있으면 good 말하라
		
		char b = 'b';
		if('a' < b && b < 'c') System.out.println("good."); 
		
		int x = 0;
		int y = 0;
		if((x = 1 + 2) > 0 || (y = 1 - 2) > 0) //x가 트루여서 y는 계산되지 않았다
			System.out.printf("x : %d, y : %d\n", x, y);
		
		String s = "he";
		if(s.equals("he") || s.equals("HE") || s.equals("He") || s.equals("hE"))
			System.out.println("he");
		
		if(s.equalsIgnoreCase("he")) // IgnoreCase API를
			System.out.println("he");
		
		s = "";
		if(s.equals("")) System.out.println("값이 없다.");
		
		boolean power = false;
		if(!power) System.out.println("전원을 켜다.");
	}
}
