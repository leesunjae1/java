package ch02.ex02;

public class C01Int {
	public static void main(String[] args) {
		int x = 10; //decimal 10진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 012; //octal 8진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0xA; // 16진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 0b1010; // 2진수
		System.out.println(Integer.toBinaryString(x));
		
		x = 1_234_567; //숫자로 생각한다
		System.out.println(x + 1);
		
		double y = 1e1;
		System.out.println(y);
		
	}
}

/*
1234567    숫자타입
1,234,567  문자타입 (컴마가 포함되어있으면 문자)
*/