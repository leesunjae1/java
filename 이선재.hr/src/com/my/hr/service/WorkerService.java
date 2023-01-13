package com.my.hr.service;

import java.util.List;

import com.my.hr.domain.Worker;

public interface WorkerService {
	public Worker getWorker();
	public void addWorker(Worker worker);
	public void fixWorker(String WorkerName, String hiredDate);
	public void delWorker();
}
