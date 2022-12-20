package ch02.ex02;

public class C03Str {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; //문자를숫자로 바꿀 때 쓰는 알고리즘
		System.out.println(sumStr);
		
	}
}
