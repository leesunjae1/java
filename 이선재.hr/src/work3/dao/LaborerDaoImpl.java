package work3.dao;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import work3.domain.Laborer;
import work3.domain.NoneException;

public class LaborerDaoImpl implements LaborerDao{
	private List<Laborer> laborers;
	private int laborerIdSeq;
	
	public LaborerDaoImpl(List<Laborer> laborers) {
		this.laborers = laborers;
		this.laborerIdSeq = 1;
	}
	
	@Override
	public List<Laborer> selectLaborers() {
		return laborers;
	}
	
	private Laborer selectLaborer(int laborerId) {
		List<Laborer> list = laborers.stream()
				.filter(laborer -> laborer.laborerId() == laborerId)
				.collect(Collectors.toList());
		Laborer laborer = null;
		if(list.size() != 0) laborer = list.get(0);
		
				return laborer;
	}
	
	@Override
	public void insertLaborer(String laborerName,LocalDate hireDate) {
		laborers.add(new Laborer(laborerIdSeq++, laborerName, hireDate));
	}

	@Override
	public void updateLaborer(Laborer laborer) {
		this.deleteLaborer(laborer.laborerId());
		laborers.add(laborer);
		laborers.sort(Comparator.comparing(Laborer::laborerId));
	}
	
	@Override
	public void deleteLaborer(int laborerId) throws NoneException {
		Laborer laborer = selectLaborer(laborerId);
		if(laborer != null) laborers.remove(laborerId);
		else throw new NoneException("해당노동자 없음");
	}
}
