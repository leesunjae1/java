package ch06.ex04.case01;

public class Animal {
	private String animalName;
	
	//public Animal() {}  이렇게 해결도 가능하다
	
	public Animal(String animalName) {
		this.animalName = animalName;
	}
	
	public String getAnimalName() {
		return this.animalName;
	}
}
