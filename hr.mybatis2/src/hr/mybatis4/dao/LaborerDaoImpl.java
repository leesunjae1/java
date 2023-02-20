package hr.mybatis4.dao;

import java.time.LocalDate;
import java.util.List;

import hr.mybatis4.config.Configuration;
import hr.mybatis4.dao.map.LaborerMap;
import hr.mybatis4.domain.Laborer;
import hr.mybatis4.domain.NoneException;

public class LaborerDaoImpl implements LaborerDao{
	private LaborerMap laborerMap;
	
	public LaborerDaoImpl() {
		this.laborerMap = Configuration.getMapper(LaborerMap.class);
	}
	
	@Override
	public List<Laborer> selectLaborers() {
		return laborerMap.selectLaboers();
	}
	
	@Override
	public void insertLaborer(String laborerName, LocalDate hireDate) {
		laborerMap.insertLaborer(laborerName, hireDate);
	}
	
	@Override
	public void updateLaborer(Laborer laborer) {
		if(laborerMap.updateLaborer(laborer) == 0)
			throw new NoneException("no");
	}
	
	@Override
	public void deleteLaborer(int laborerId) {
		if(laborerMap.deleteLaborer(laborerId) == 0)
			throw new NoneException("no");
	}

}
