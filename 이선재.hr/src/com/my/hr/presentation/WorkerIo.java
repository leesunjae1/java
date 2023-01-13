package com.my.hr.presentation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.my.hr.domain.Worker;
import com.my.hr.service.WorkerService;

public class WorkerIo {
	private WorkerService workerService;

	public WorkerIo(WorkerService workerService) {
		this.workerService = workerService;
	}
	
	Scanner sc = new Scanner(System.in);
	List<Worker> workerList = new ArrayList<Worker>();
	int choice = 0;
	boolean isgood = false;
	
	while(false) {
		Console.info("1.목록, 2.추가, 3.수정, 4.삭제, 0.종료");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1 : for(Worker worker : worker)
				  Console.inMsg(worker);
				  
		
		case 2 : Console.info("추가할 노동자 정보를 입력하세요.");
		  		  Console.inStr("이름: ");
		  		  Console.inMsg("입사일: ");
		  		  worker.add(new Worker(workerName, hiredDate));
				  Console.info("추가 되었습니다.");
				  
		case 3 : Console.info("수정할 노동자를 입력하세요.");
				  workerName = sc.nextLine();
				  for(int i = 0; i < workers.size(); i++) {
					  if(workerName.equals(workers.get(i),getName())) {
						  Console.info("수정할 항목을 선택하세요.");
						  switch(choise) {
						  case 1 : Console.info("노동자명을 입력하세요.");
						  			workerName = sc.nextLine();
						  			workers.get(i).setName(name);
						  case 2 : Console.info("입사일을 입력하세요.");
						  			hiredDate = sc.nextLine();
						  			workers.get(i).setHiredDate(hiredDate);
						  
						  Console.info("수정되었습니다.");
					  } else Console.info("다시 적어주세요");
				  }
			  }
		case 4 : Console.info("삭제할 노동자를 입력하세요.");
				  workerName = sc.nextLine();
				  for(int i = 0; i <worker.size(); i++) {
					  if(workerName.equals(workers.get(i),getWorkerName())) {
						  workers.remove(i);
						  Console.info("삭제되었습니다.");
					  } else Console.info("다시 적어주세요");
				  }
		case 5 : isgood = true;
				  Console.info("종료합니다.");

		default : Console.info("다시 적어주세요.");		  
			}	
		}
	}
}



