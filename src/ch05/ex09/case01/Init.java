package ch05.ex09.case01;

import ch05.home.ex06.case02.Console;

public class Init {
	private static int s;
	private int i;
	
	static {
		Init.s = 1;
		//this.i = 1; 
		Console.info("static{}");
	}
	
	{ //인스턴스 블럭, 여러개 만들수있지만 의미가없다
		this.i = 1;
		Init.s = 1;// 할 수 있지만 static블럭에 쓰는게 가독성이 좋다
		Console.info("{}");
	}
	
	{
		Console.info("{}2");
	}
	
	public Init() { 
		Console.info("Init()");
	}
	
	public Init(int i) { //생성자 블럭 
		Console.info("Init(int)");
	}
}
