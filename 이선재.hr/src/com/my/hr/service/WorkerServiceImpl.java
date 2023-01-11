package com.my.hr.service;

import com.my.hr.dao.WorkerDao;
import com.my.hr.domain.Worker;

public class WorkerServiceImpl implements WorkerService{
	private WorkerDao workerDao;
	
	public WorkerServiceImpl(WorkerDao workerDao) {
		this.workerDao = workerDao;
	}
	
	@Override
	public Worker getWorker() {
		return workerDao.selectWorker();
	}
	
	@Override
	public void addWorker(Worker worker) {
		workerDao.insertWorker(worker);
	}
	
	@Override
	public void fixWorker(String workerName, String hiredDate) {
		workerDao.updateWorker(workerName, hiredDate);
	}
	
	@Override
	public void delWorker() {
		workerDao.deleteWorker();
	}
}
