package dao.map;

import java.time.LocalDate;
import java.util.List;

import domain.Laborer;

public interface LaborerMap {
	List<Laborer> selectLaborers();
	int insertLaborer(String laborerName, LocalDate regDate);
	int updateLaborer(Laborer laborer);
	int deleteLaborer(int LaborerId);
}
