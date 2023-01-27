package work2;

import java.util.ArrayList;
import java.util.List;

import work2.dao.LaborerDao;
import work2.dao.LaborerDaoImpl;
import work2.domain.Laborer;
import work2.presentation.Console;
import work2.presentation.LaborerIo;
import work2.service.LaborerService;
import work2.service.LaborerServiceImpl;

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
