package sideproject.warehouse;

import java.util.Date;
import java.util.Scanner;

public interface KeepPackage {

	static final int MAXPERIOD = 28;
	
	int calEachPirce();
	
	Date periodOfKeep();
	
	Date OverPeriod();
	
	void locationProduct();
	
	void moveProduct();
	
	
}
