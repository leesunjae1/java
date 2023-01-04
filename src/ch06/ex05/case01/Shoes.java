package ch06.ex05.case01;

public class Shoes extends Product{
	public int price;
	
	public Shoes(int price) {
		super(price * 2); //누구의 price를 알기위해서 * 2를 해줫다
		this.price = price;
	}
}
