package ch07.ex04.case03;

public class Slot {
	private Ball[] balls;
	private Ball Ball;
	public Slot() {
		balls = new Ball[45];
		
		for(int i = 0; i < balls.length; i++)
			balls[i] = new Ball(i + 1);
	}
	
	public Ball chuck() {
		int i = 0;
		Ball ball = null;
// 2번 이상 나오는 공을 해결하라.		
		do {
			i = (int)(Math.random() * 45);
			ball = balls[i];
			balls[i] = null;
		}while(ball ==null);
		
		return ball;	
	}
}

