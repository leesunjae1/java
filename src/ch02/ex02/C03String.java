package ch02.ex02;

public class C03String {
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = 3;
		int sum = a + b + c;
		System.out.printf("sum: %d\n", sum);
		
		String sumStr = "" + sum; //문자를숫자로 바꿀 때 쓰는 알고리즘
		System.out.println(sumStr);	
		
		int i = Integer.parseInt(sumStr);
		
		String s = a + b + "";
		System.out.println(s);
		
		s = "" + a + b;   //스트링이 뒤에 값이랑 더하기가 된다
		System.out.println(s);
		
		String dialog = "John said, \"hello\"."; //특수문자를 일반문자로 바꿀때 \ 이걸 쓴다.
		System.out.println(dialog);
	}
}
