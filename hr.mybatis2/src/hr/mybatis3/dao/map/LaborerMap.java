package hr.mybatis3.dao.map;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import hr.mybatis3.domain.Laborer;

public interface LaborerMap {
	List<Laborer> selectLaborers();
	int insertLaborer(@Param("laborerName")String laborerName,
			@Param("hireDate")LocalDate hireDate);
	int updateLaborer(Laborer laborer);
	int deleteLaborer(int laborer);
}
