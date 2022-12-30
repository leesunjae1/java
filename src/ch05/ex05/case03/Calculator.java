package ch05.ex05.case03;

public class Calculator {
	public int add(int a, int b) { //절차지향
		return a + b;
	}
	
	public Paper add(Paper paper) {
		// paper 의 a, b 값을 더한 result 를 paper에 적어라
		// 위 paper를 return하라 
		paper.setResult(paper.getA() + paper.getB()); //객체지향
		return paper;
	}
}
