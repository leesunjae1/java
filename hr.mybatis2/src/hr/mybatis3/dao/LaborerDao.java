package hr.mybatis3.dao;

import java.time.LocalDate;
import java.util.List;

import hr.mybatis3.domain.Laborer;

public interface LaborerDao {
	List<Laborer> selectLaborers();
	void insertLaborer(String laborerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int LaborerId);
}
