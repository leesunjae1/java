package ch04.ex03;

public class C01While {
	public static void main(String[] args) {
		int weight = 80;
		int jumpCnt = 0;
	//반복을 해야하는데 횟수를 모를때 while를 쓴다	
		
		while(weight > 60) {
			jumpCnt++;
			weight--;
		}
		
		System.out.printf("%d 줄넘기해서, 몸무게 %d이 되었습니다", jumpCnt, weight);
	}
}
