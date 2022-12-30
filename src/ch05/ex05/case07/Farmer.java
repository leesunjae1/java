package ch05.ex05.case07;

public class Farmer { //주어로 쓸 객체이다 
	public Apple sell(int price) {
		Apple apple = new Apple();
		apple.setPrice(price);
		
		return apple;
	}
}
