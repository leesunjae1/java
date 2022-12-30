package ch05.ex05.case05;

public class Main {
	public static void main(String[] args) {
		Apple apple = new Apple();
		Basket basket = new Basket();
		
		basket.setApple(apple); //사과를 담다
		basket.getApple(); //사과를 꺼내다
	}

}
