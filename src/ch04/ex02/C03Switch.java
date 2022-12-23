package ch04.ex02;

public class C03Switch {
	public static void main(String[] args) {
		int day = 2;
		
		String dayName = switch(day) {
		case 1 -> "sunday";      //리턴값들이 있는거다
		case 2 -> "monday";
		case 3 -> "tuesday";
		case 4 -> "wednesday";
		case 5 -> "thursday";
		case 6 -> "friday";
		case 7 -> "saturday";
		default -> "none";
		};  //세미콜론 붙여야한다
		
		System.out.println(dayName);
	}
}
