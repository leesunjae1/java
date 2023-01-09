package ch07.ex05.case01;

public class Main {
	public static void main(String[] args) {
		Basket<Apple> basket = new Basket<Apple>();
		basket.set(new Apple());
		
		System.out.println(basket.get());
		
		//basket.set(new Grape()); 지금은 사과 바구니라 안들어간다.
		
		Basket<Grape> basket2 = new Basket<Grape>();
		basket2.set(new Grape());
		System.out.print(basket2.get());
	}
}
