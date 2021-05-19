import java.util.RANDOM
public classs EmpWage_for_Month {
	Random random = new Random();
	public static final int IS_FULL_TIME = 1;
	public static final int IS_PART_TIME = 2;
	public static final int EMP_RATE_PER_HR = 20;
	public static final NUM_OF_WORKING_DAYS = 20;

public static void main (String args[]) {
	//variables
	int EmpHrs = 0; EmpWage = 0; TotalWage = 0;
	//calculation
	for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
	int empCheck = Random.nextInt(3);
	switch (empCheck) {
	case IS_FULL_TIME:
	EmpHrs = 8;
	break;

	case IS_PART_TIME:
	EmpHrs = 4;
	break;
	
	default:
	EmpHrs = 0;
	break;
	}
	empWage = EmpHrs * EMP_RATE_PER_HR;
	TotalWage += empWage;
	System.out.println("Total Wage = " +TotalWage);
}
}
}
