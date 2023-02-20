package hr.mybatis5.dao;

import java.time.LocalDate;
import java.util.List;

import hr.mybatis5.domain.Laborer;

public interface LaborerDao {
	List<Laborer> selectLaborers();
	void insertLaborer(String laborerName, LocalDate hireDate);
	void updateLaborer(Laborer laborer);
	void deleteLaborer(int Laborer);
}
