package ch03.ex05;

public class Overflow {
	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 1_000_000;
		
		long c = a + b;
		System.out.println(c);
		
		c = a * b;
		System.out.println(c);
		
		c = (long)a * b;
		System.out.println(c);
		
		int x = a * b / a;
		x = a / b * a;  //나누기를 먼저한다 오버플로우를 막기위해서
		System.out.println(x);
	}
}
