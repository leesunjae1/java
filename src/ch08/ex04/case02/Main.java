package ch08.ex04.case02;

public class Main {
	public static void main(String[] args) {
		String userId = "gambit";
		
		try {
			if(userId.length() > 3)
				throw new LengthException("문자 길이가 초과되었습니다.");
		} catch(LengthException e) {
			e.printStackTrace(); //at ch08.ex04.case02.Main.main(Main.java:9)이 출력되었다
		}
		
		throw new NumberException("숫자가 아닙니다.");
	}
}
