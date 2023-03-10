package domain;

import java.time.LocalDate;

public class Laborer {
	private int laborerId;
	private String laborerName;
	private LocalDate hireDate;
	
	public Laborer(int laborerId, String laborerName, LocalDate hireDate) {
		this.laborerId = laborerId;
		this.laborerName = laborerName;
		this.hireDate = hireDate;
	}
	
	public int getLaborerId() {
		return laborerId;
	}

	public String getLaborerName() {
		return laborerName;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	@Override
	public String toString() {
		return String.format("%d %s %s", laborerId, laborerName, hireDate);
	}
}
