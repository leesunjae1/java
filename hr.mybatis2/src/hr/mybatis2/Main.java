package hr.mybatis2;

import hr.mybatis2.dao.LaborerDao;
import hr.mybatis2.dao.LaborerDaoImpl;
import hr.mybatis2.presentation.LaborerIo;
import hr.mybatis2.service.LaborerService;
import hr.mybatis2.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		LaborerDao laborerDao = new LaborerDaoImpl();
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
	}
}
