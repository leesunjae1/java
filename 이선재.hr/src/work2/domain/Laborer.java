package work2.domain;

import java.time.LocalDate;

public record Laborer(int laborerId, String laborerName, LocalDate hireDate) {
	@Override
	public String toString() {
		return String.format("%2d %-5 %s", laborerId, laborerName, hireDate);
	}
}
