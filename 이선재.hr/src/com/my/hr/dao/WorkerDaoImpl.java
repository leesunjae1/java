package com.my.hr.dao;

import com.my.hr.domain.Worker;

public class WorkerDaoImpl implements WorkerDao{
	private Worker worker;
	
	@Override
	public Worker selectWorker() {
		return this.worker;
	}
	
	@Override
	public void insertWorker(Worker worker) {
		this.worker = worker;
	}
	
	@Override
	public void updateWorker(String workerName, String hiredDate) {
		this.worker.setWorkerName(workerName);
		this.worker.setHiredDate(hiredDate);
	}
	
	@Override
	public void deleteWorker() {
		this.worker = null;
	}
	
}
