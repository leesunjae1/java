package hr.mybatis4;

import hr.mybatis2.presentation.LaborerIo;
import hr.mybatis2.service.LaborerService;
import hr.mybatis2.service.LaborerServiceImpl;
import hr.mybatis4.dao.LaborerDao;
import hr.mybatis4.dao.LaborerDaoImpl;

public class Main {
	public static void main(String[] args) {
		LaborerDao laborerDao = new LaborerDaoImpl();
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		
		laborerIo.play();
	}
}