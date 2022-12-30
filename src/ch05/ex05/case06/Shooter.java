package ch05.ex05.case06;

public class Shooter {
	//총잡이가 총을 소지한다
	private Gun gun; //멤버변수를 dependency라고 한다.
	
	public void fire() {
		gun.fire();
		
	}

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
}
