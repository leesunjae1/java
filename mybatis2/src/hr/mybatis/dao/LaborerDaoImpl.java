package hr.mybatis.dao;

import java.time.LocalDate;
import java.util.List;

import config.Configuration;
import hr.mybatis.dao.map.LaborerMap;
import hr.mybatis.domain.Laborer;
import hr.mybatis.domain.NoneException;

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
			throw new NoneException("해당 노동자가 없습니다");	
	}
	
	@Override
	public void deleteLaborer(int laborerId) {
		if(laborerMap.deleteLaborer(laborerId) == 0)
			throw new NoneException("해당 노동자가 없습니다");
	}
	

}
