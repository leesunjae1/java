package ch05.ex03.case03;

public class Main {
	public static void main(String[] args) {
		
		House house1 = new House(); //new가 한개만 있기떄문에 객체는 1개이다
		House house2 = null;
		
		house1.setAddress("서울 강남구 역삼동");
		
		house2 = house1;
		
		// house1 의 키를 house 2에 넘겨줬다.
	}
}
