package ch03.ex02;

public class C02Not {
	public static void main(String[] args) {
		boolean power = false; //flag variable 두가지 상태만 나타내는 상태
		power = !power;
		System.out.println(power);
		
		power = !power;
		System.out.println(power);
	}
}
