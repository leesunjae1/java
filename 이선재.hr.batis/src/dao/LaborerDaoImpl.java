package dao;

import java.time.LocalDate;
import java.util.List;

import config.Configuration;
import dao.map.LaborerMap;
import domain.Laborer;

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
	public int insertLaborer(String laborerName, LocalDate hireDate) {
		return laborerMap.insertLaborer(laborerName, hireDate);
	}
	
	@Override
	public int updateLaborer(Laborer laborer) {
		return laborerMap.updateLaborer(laborer);
	}
	
	@Override
	public int deleteLaborer(int LaborerId) {
		return laborerMap.deleteLaborer(LaborerId);
	}
}
