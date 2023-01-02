package ch06.ex02.case01;

public class A {
	private int a;
	int b;           //기본접근제한자 같은 패키지에서만 보인다
	protected int c; //같은 패키지에서만 보인다 , 다른패키지에 있어도 자식이면 보인다
	public int d;
	
	private void m1() {}
	void m2() {}
	protected void m3() {}
	public void m4() {}	
}	