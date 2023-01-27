package work1.service;

import java.time.LocalDate;
import java.util.List;

import work1.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaborers();
	void addLaborer(String LaborerName, LocalDate hireDate);
	void fixLaborer(Laborer laborer);
	void delLaborer(int laborerId);
}
