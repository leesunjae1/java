package hr.mybatis5.dao;

import java.time.LocalDate;
import java.util.List;

import hr.mybatis5.config.Configuration;
import hr.mybatis5.dao.map.LaborerMap;
import hr.mybatis5.domain.Laborer;

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
	
	@
	
	
	

}
