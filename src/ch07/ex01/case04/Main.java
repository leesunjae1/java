package ch07.ex01.case04;

public class Main {
	public static void main(String[] args) {
		Platanus platanus = new Platanus();
		// 관점을 tree, platanus로 따로 보고있다
		Tree tree = new Platanus();
		platanus = (Platanus)tree;
		
		tree = platanus;
		tree = (Tree)platanus;
	}
}
