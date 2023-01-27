package work1;

import java.util.ArrayList;
import java.util.List;

import work1.dao.LaborerDao;
import work1.dao.LaborerDaoImpl;
import work1.domain.Laborer;
import work1.presentation.Console;
import work1.presentation.LaborerIo;
import work1.service.LaborerService;
import work1.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		List<Laborer> laborers = new ArrayList<>();
		LaborerDao laborerDao = new LaborerDaoImpl(laborers);
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
		Console.info("end");
	}
}
