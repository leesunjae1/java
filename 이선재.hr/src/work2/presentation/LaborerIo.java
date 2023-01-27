package work2.presentation;

import work2.service.LaborerService;

public class LaborerIo {
	private LaborerService laboereService;
	private String menu;
	
	public LaborerIo(LaborerService laborerService) {
		this.laborerService = laborerService;
		this.menu = Job.labels();
	}
	
	public void play() {
		Job job = null;
		
		while((job = choose(menu)) != Job.EXIT) {
			switch(job) {
			case LIST ->listLaborers();
			case ADD -> addLaborer();
			case FIX -> fixLaborer();
			case DEL -> delLaborer();
			}
		}
	}
	private Job choose(String menu) {
		int choice = 0;
		boolean isgood = false;
		
		do {
			choice = Console.inNum(menu);
			if(choice < 0 || choice > Job.length() -1)
				Console.err("메뉴 번호를 입력하세요");
			else isgood = true;
		}while(!isgood);
		
		return Job.valueOf(choice);
	}
	
	private void listLaborer() {
		List<Laborer> laborers = laboereService.getLaborers();
		System.out.println("ID        이름        입사일");
		System.out.println("-----------------------------");
		
		if(laborers.size() > 0) laborers.forEach(Console::info);
		else Console.info("노동자가 없습니다");
	}
	
	private void addLaborer() {
		String laborerName = Console.inStr("노동자를 입력하세요" , 5);
		if(!laborerName.equals("0")) {
			LocalDate hireDate = Console.inDate("입사일을 입력하세요");
			Console.info("추가했습니다");
		}else Console.info("추가 취소합니다");
	}
	
	private void fixLaborer() {
		int laborerId = Console.inNum("노동자 ID를 입력하세요");
		if(laborerId != 0) {
			String laborerName = Console.inStr("노동자명 입력", laborerId);
			LocalDate hireDate = Console.inDate("입사일 입력");
			try {
				laboereService.fixLaborer(new Laborer(laborerId, laborerName, hireDate));
				Console.info("노동자 수정했습니다");
			}catch(NoneException e ) {
				Console.err(e.getMessage());
			}
		} else Console.info("수정 취소합니다");

	}
	
	privaate void delLaborer() {
		int lavorerId = Console.inNum("노동자ID를 입력하세요");
		if(laborer != 0) {
			try {
				laborerService.delLaborer(laborerId);
				Console.info("노동자를 삭제했습니다");
			}catch(NoneException e) {
				Console.err(e.getMessage());
			}
		}else Console.info("삭제취소합니다");
	}
}
