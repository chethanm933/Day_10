package EmployeeWage;

public class EmployeeUC2 {
	
	final static int fulltime = 1;
	final static int parttime = 2;
	int emp_hr;
	
	EmployeeWageComputation empwage = new EmployeeWageComputation();
	
	
	public int employeeWageUC2(int checkattendance) {
		int full_time_wrk_hr = empwage.working_hour;
		
		switch(checkattendance) {
		
		case fulltime:
			emp_hr = full_time_wrk_hr;
			break;
			
		case parttime:
			emp_hr = full_time_wrk_hr/2;
			break;
			
		default:
			emp_hr = 0;
			break;
		
		} 
		return emp_hr;
	}
	
	public String employee(String Name) {
		return Name;
	}
	
}	

	

 
