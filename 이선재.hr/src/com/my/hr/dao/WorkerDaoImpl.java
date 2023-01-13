package com.my.hr.dao;

import com.my.hr.domain.Worker;

public class WorkerDaoImpl implements WorkerDao{
	private Worker workers;
	
	public WorkerDaoImpl(Worker workers) {
		this.workers = workers;
	}
	
	@Override
	public Worker selectWorker() {
		return this.workers;
	}
	
	@Override
	public void insertWorker(Worker worker) {
		this.workers = worker;
	}
	
	@Override
	public void updateWorker(String workerName, String hiredDate) {
		this.workers.setWorkerName(workerName);
		this.workers.setHiredDate(hiredDate);
	}
	
	@Override
	public void deleteWorker() {
		this.workers = null;
	}
	
	@Override
	public void listWorker() {
		this.workers = workers;
	}
}
