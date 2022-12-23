package ch04.ex02;

public class C04Switch {
	public static void main(String[] args) {
		String comment = "ab";
		
		String msg = switch(comment.length()) { //메소드 콜 문장이 삽입
		case 1 -> "too short.";
		case 2 -> "good";
		default -> "too long";
		};
		System.out.println(msg + '\n');
		
		msg = switch(comment.length()) {
		case 1 -> "too short.";
		case 11 -> {yield "I don't know.";}  // 실행문안에 블럭을 넣을떄 yield를 넣어준다
		case 2 -> {
			String message = comment + " is good. ";
			yield message;
		}
		default -> {yield comment + " is too long.";}
		};
		System.out.println(msg);
		
		//yield = keyword X, restricted identifier O (제안자이다)
		int yield = 1;
		System.out.println(yield);
		// int switch = 1; 오류 switch는 keyword이다
	}
}
