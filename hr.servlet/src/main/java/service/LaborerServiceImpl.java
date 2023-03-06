package service;

import java.time.LocalDate;
import java.util.List;

import dao.LaborerDao;
import dao.LaborerDaoImpl;
import domain.Laborer;
import domain.NoneException;

public class LaborerServiceImpl implements LaborerService{
	private LaborerDao laborerDao;
	
	public LaborerServiceImpl() {
		this.laborerDao = new LaborerDaoImpl();
	}
	
	@Override
	public List<Laborer> getLaborers() {
		return laborerDao.selectLaborers();
	}
	
	@Override
	public void addLaborer(String laborerName, LocalDate hireDate) {
		laborerDao.insertLaborer(laborerName, hireDate);
	}
	
	@Override
	public void fixLaborer(Laborer laborer) throws NoneException {
		laborerDao.updateLaborer(laborer);
	}
	
	@Override
	public void delLaborer(int laborerId) throws NoneException {
		laborerDao.deleteLaborer(laborerId);
	}
}