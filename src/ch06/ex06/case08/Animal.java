package ch06.ex06.case08;

public interface Animal {
	void move();
	
	default void eat() {} //동물이면 기본적으로 먹는다는 표현한다
}
