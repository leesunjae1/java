package hr.mybatis.service;

import java.time.LocalDate;
import java.util.List;

import hr.mybatis.domain.Laborer;

public interface LaborerService {
	List<Laborer> getLaborers();
	void addLaborer(String laborerName, LocalDate hireDate);
	void fixLaborer(Laborer laborer);
	void delLaborer(int laborerId);
}
