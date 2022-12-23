package ch02.ex02;

public class C04String {
	public static void main(String[] args) {
	String s = "|" + " a happy ".trim() + "|"; // .trim 스페이스를 제거해준다
	s = s.concat(" dog"); // .concat 주어에 목적어를 붙히는 기능
	s = s.substring(2); // 지정한 인덱스 이하를 잘라낸다
	System.out.println(s);
	
	s = "hello";
	System.out.printf("%c\n", s.charAt(1)); // 지정한 한글자만 꺼낼때 쓴다
	
	int i = "apple".codePointAt(1); // .codePointAt 유니코드가 나온다
	i = "a".hashCode();   // a 97
	i = "b".hashCode();   // b 98
	i = "c".compareTo("a"); //a와c의 유니코드 차이값
	i = "a".compareTo("b");
	i = "A".compareTo("a");
	i = "A".compareToIgnoreCase("a");
	i = s.indexOf("l");  //글자의 위치 값
	i = s.lastIndexOf("l");
	i = s.length();
	
	System.out.println(i);
	
	s = "develop";
	boolean b = s.startsWith("de");
	b = s.endsWith("lop");
	b = s.equals("develop"); 
	b = s.equals("Develop");
	b = s.equalsIgnoreCase("Develop");
	b = "".isEmpty();
	b = s.matches("[a-zA-Z]*"); //b에 a-zA-Z가 있는지 확인
	b = s.matches("[0-9]*"); //b에 숫자가있는지 
	System.out.println(b);
	}
}
