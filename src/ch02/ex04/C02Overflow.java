package ch02.ex04;

public class C02Overflow {
	public static void main(String[] args) {
		// byte b =128;
		byte b = 127;
		//b = b + 1; 컴파일에러
		
		b++; //b + 1 과 같다
		b++;
		System.out.print(b);
	}
}
