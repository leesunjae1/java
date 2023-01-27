package work1.service;

import java.time.LocalDate;
import java.util.List;

import work1.dao.LaborerDao;
import work1.domain.Laborer;
import work1.domain.NoneException;

public class LaborerServiceImpl implements LaborerService{
	private LaborerDao laborerDao;
	
	public LaborerServiceImpl(LaborerDao laborerDao) {
		this.laborerDao = laborerDao;
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
