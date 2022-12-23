package ch03.ex04;

public class C01Arith {
	public static void main(String[] args) {
		byte a = 3;
		byte b = 2;
		// 과제 : 아래 compile error를 해결하라
		//byte c = a + b;
		byte c = (byte)(a + b);
		System.out.println(c);
		
		c++; // c = c(byte) + 1(int);
		System.out.println(c);
		
		double d = a / b;
		System.out.println(d);
		
		//과제 : d 변수에 1.5가 저장되록한다 d = a / b;
		 d = (double)a / b;
		System.out.println(d);
		d = 1.0 * a / b;
		System.out.println(d);
	}
}
