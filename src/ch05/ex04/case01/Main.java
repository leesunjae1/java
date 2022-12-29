package ch05.ex04.case01;

public class Main {
	public static void main(String[] args) {
		System.out.printf("%d, %d\n", Card.width, Card.height);
		
		Card.width = 10;
		Card.height = 20;
		
		//Card.kind;   변수가 없어서 kind 실행이 안된다
		//Card.number;               number도 같다
		
		Card card1 = new Card();  //new 카드를 실행하면 kind, number 가능
		Card card2 = new Card();
		
		card1.kind = "heart";
		card1.number = 7;
		
		card2.kind = "spade";
		card2.number = 4;
				
		System.out.printf("%s %d %d %d\n",
				card1.kind, card1.number, card1.width, card1.height);
		System.out.printf("%s %d %d %d\n",
				card1.kind, card1.number, Card.width, Card.height);
		//static 변수는 클래스. 하고 써야 유지보수가 가능하다
		System.out.printf("%s %d %d %d\n",
				card2.kind, card2.number, card2.width, card2.height);
	}
}

//lock / queue 많이 쓰는 알고리즘이다 