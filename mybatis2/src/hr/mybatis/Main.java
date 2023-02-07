package hr.mybatis;

import hr.mybatis.dao.LaborerDao;
import hr.mybatis.dao.LaborerDaoImpl;
import hr.mybatis.presentation.LaborerIo;
import hr.mybatis.service.LaborerService;
import hr.mybatis.service.LaborerServiceImpl;

public class Main {
	public static void main(String[] args) {
		LaborerDao laborerDao = new LaborerDaoImpl();
		LaborerService laborerService = new LaborerServiceImpl(laborerDao);
		LaborerIo laborerIo = new LaborerIo(laborerService);
		
		laborerIo.play();
	}
}
