package hr.mybatis2.dao;

import java.time.LocalDate;
import java.util.List;

import hr.mybatis2.config.Configuration;
import hr.mybatis2.dao.map.LaborerMap;
import hr.mybatis2.domain.Laborer;
import hr.mybatis2.domain.NoneException;

public class LaborerDaoImpl implements LaborerDao{
	private LaborerMap laborerMap;
	
	public LaborerDaoImpl() {
		this.laborerMap = Configuration.getMapper(LaborerMap.class);
	}
	
	@Override
	public List<Laborer> selectLaborers() {
		return laborerMap.selectLaborers();
	}
	
	@Override
	public void insertLaborer(String laborerName, LocalDate hireDate) {
		laborerMap.insertLaborer(laborerName, hireDate);
	}
	
	@Override
	public void updateLaborer(Laborer laborer) {
		if(laborerMap.updateLaborer(laborer) == 0)
			throw new NoneException("노동자가 없습니다");
	}
	
	@Override
	public void deleteLaborer(int laborer) {
		if(laborerMap.deleteLaborer(laborer) == 0)
			throw new NoneException("노동자가 없습니다");
	}
	

}
