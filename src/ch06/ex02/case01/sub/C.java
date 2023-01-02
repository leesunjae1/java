package ch06.ex02.case01.sub;

import ch06.ex02.case01.A;

public class C extends A {
	public void test() {
		int x = 0;
		
		// x = this.a;
		// x = this.b; 패키지가 달라서 b를 사용못한다.
		x = this.c; 
		x = this.d;
		
		// this.m1();
		// this.m2();
		this.m3();
		this.m4();
	}
}
