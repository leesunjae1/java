package ch02.ex03;

public class C01IntDouble {
	public static void main(String[] args) {
		int i = 1;
		double d = 0.0;
		
		d = i;
		System.out.printf("%f, %d\n", d, i);
		
		d = (double)i;  
		System.out.printf("%f, %d\n", d, i);
		
		//i = d; 오류 
		i = (int)d; //캐스팅연산자가 쓴 값을 i에게 준거다
		System.out.printf("%f, %d", d, i);
	}
}
