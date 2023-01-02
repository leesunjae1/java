package ch05.ex09.case02;

public class Phone {
	private static int cnt;
	private int serial;
	
	{
		serial = ++cnt * 100;
	}
	
	public Phone() {} //생성자 오버로딩할떄 생성자를 만들어준다 
	
	public Phone(int serial) {
		this.serial = serial;
	}
	
	public int getSerial() {
		return this.serial;
	}
}