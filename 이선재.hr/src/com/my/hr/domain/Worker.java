package com.my.hr.domain;

import java.time.LocalDate;

public class Worker {
	private final int workerId;
	private String workerName;
	private String hiredDate;
	
	public Worker(int workerId, String workerName, String hiredDate) {
		this.workerId = workerId;
		this.workerName = workerName;
		this.hiredDate = hiredDate;
		
	}

	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String workerName) {
		this.workerName = workerName;
	}

	public String getHiredDate() {
		return hiredDate;
	}

	public void setHiredDate(String hiredDate) {
		this.hiredDate = hiredDate;
	}

	public int getWorkerId() {
		return workerId;
	}
	
	@Override
	public String toString() {
		return String.format("%s %s", workerName, hiredDate);
	}
}