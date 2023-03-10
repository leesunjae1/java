package hr.mybatis4.dao.map;

import java.time.LocalDate;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import hr.mybatis4.domain.Laborer;

public interface LaborerMap {
	List<Laborer> selectLaboers();
	int insertLaborer(@Param("laborerName")String laborerName,
					@Param("hireDate")LocalDate hireDate);
	int updateLaborer(Laborer laborer);
	int deleteLaborer(int laborerId);
}
