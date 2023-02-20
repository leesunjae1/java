package hr.mybatis5.domain;

import java.time.LocalDate;

public class Laborer {
	private int laborerId;
	private String laborerName;
	private LocalDate hireDate;
	
	public Laborer(int laborerIdm, String laborerName, LocalDate hireDate) {
		this.laborerId = laborerId;
		this.laborerName = laborerName;
		this.hireDate = hireDate;
	}
	@Override
	public String toString() {
		return String.format("%d, %s, %d", laborerId, laborerName, hireDate);
	}
}
