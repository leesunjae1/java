package com.my.hr.dao;

import com.my.hr.domain.Worker;

public interface WorkerDao {
	public Worker selectWorker();
	public void insertWorker(Worker worker);
	public void updateWorker(String workName, String hiredDate);
	public void deleteWorker();
}
