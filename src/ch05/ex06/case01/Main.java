package ch05.ex06.case01;

public class Main {
	public static void main(String[] args) {
		Man.say("I love java."); //누가 말하는지 알 수가 없다(객체지향이 아니다)
		//Man.tell(""); 
		
		Man man = new Man();
		man.tell("I love java.");
		man.say("Hello.");
	}
}
