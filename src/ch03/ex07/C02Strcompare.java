package ch03.ex07;

public class C02Strcompare {
	public static void main(String[] args) {
		boolean b = false;
		
		String s = "a";
		b = s == "a";
		
		s = new String("a");
		System.out.println(s);
		b = s == "a";
		
		b = s.equals("a"); //string 을 비교할때 equals을 써야 안전하다
		
		System.out.println(b);
	}
}
