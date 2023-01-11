package com.my.hr.presentation;

import com.my.hr.service.WorkerService;

public class WorkerIo {
	private WorkerService workerService;
	
	public WorkerIo(WorkerService workerService) {
		this.workerService = workerService;
	}
	
	public void play() {
		String workerName = Console.inStr(" ");
	}

}
