package ch06.ex06.case05;

import java.time.LocalDate;

public interface Electronic { 
	public static final int VOLTAGE = 200;
	static final String MAKER_NAME = "LG";
	final int WEIGH =10;
	LocalDate PRODUCEDDATE = LocalDate.now();
	
	public abstract void displatMsg();
	abstract int getTemperature();
	String getModelName();
}
