package work2.service;

import java.time.LocalDate;
import java.util.List;

import work2.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaborers();
	void addLaborer(String LaborerName, LocalDate hireDate);
	void fixLaborer(Laborer laborer);
	void delLaborer(int laborerId);
}
