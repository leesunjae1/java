package ch07.ex07.case02;

public class Main {
	public static void main(String[] args) {
		Human human = () -> System.out.println("Human say.");
		human.say();
		//human.walk();
		Human.walk(); //static메서드라 대문자로 써야한다.
		human.sleep();
		
		human = new Student();
		human.say();
		human.sleep();
	}
}
