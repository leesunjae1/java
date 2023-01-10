package ch08.ex04.case02;

public class LengthException extends Exception{
	public LengthException(String msg) {
		super(msg); //부모한테 떠 넘긴다.
	}
}
