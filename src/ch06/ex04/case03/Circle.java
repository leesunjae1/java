package ch06.ex04.case03;

public class Circle	{
	private Point point;
	private int r;
	//위 compile error를 해결토록 생성자를 기술하라
	public Circle(int x, int y, int r) {
		this.point = point;
		this.r = r;
	}
	
	//@Override
	//public String toString() {
	//return String ("(%d, %d), %d", getX(), getY(), r);
	//}
}

