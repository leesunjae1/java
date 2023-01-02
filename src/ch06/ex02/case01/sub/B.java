package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class B {
	public void test() {
		A a = new A(); 
		
		int x = 0;
	//	x = a.a; private라서 접근을 못한다
	//	x = a.b; 
	//	x = a.c;
		x = a.d;
		
	//	a.m1();
	//	a.m2();
	//	a.m3();
		a.m4();
	}
}
