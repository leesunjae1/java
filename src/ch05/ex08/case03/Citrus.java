package ch05.ex08.case03;

public class Citrus {
	private String citrusName;
	
	public Citrus() {
		//this.citrusName = "레드향";
		this("레드향");
	}
	//위 아래 코드가 뜻이 중복이된다.
	
	public Citrus(String citrusName) {
		this.citrusName = citrusName;
	}
	
	public void setCitrusName(String citrusName) {
		this.citrusName = citrusName; //현장에서는 섹터만 쓰인다
	}
}
