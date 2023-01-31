package domain;

import java.time.LocalDate;

public class Laborer {
	private int laborerId;
	private String laborerName;
	private LocalDate regDate;
	
	public Laborer(int aborerId, String laborerName, LocalDate regDate) {
		this.laborerId = laborerId;
		this.laborerName = laborerName;
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return String.format("%d %s %s", laborerId, laborerName, regDate);
	}
}
