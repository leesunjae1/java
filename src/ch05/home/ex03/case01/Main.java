package ch05.home.ex03.case01;

public class Main {
	public static void main(String[] args) {
		Cat cat = new Cat();
		
		cat.setColor("black");
		cat.setCatName("야코미"); //행동을 나타낸 코드이다.(이름을 지었습니다)
		
		System.out.printf("%s %s", cat.getColor(), cat.getCatName());
		// 확인차가 아니면 print까지 쓸 필요가없다
	}
}
/*
검은 고양이 한 마리를 주웠습니다.
야코미라고 이름을 지었습니다.
*/