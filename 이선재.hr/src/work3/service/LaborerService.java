package work3.service;

import java.time.LocalDate;
import java.util.List;

import work3.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaboreres();
	void addLaborer(String laborerName, LocalDate hireDate);
	void fixLaborer(Laborer laborer);
	void delLaborer(int laborerId);
}
