package EmployeeWage;

public class EmployeeUC1 {
	
	
	public int PartTimeFullTime(int fulltime, int parttime) {
		
		
		int attendance = (int) (Math.random() *10 % 2) + 1;
		
			
		if(attendance == fulltime) {
//			System.out.println("employee is full time :");
		} 
		
		if(attendance == parttime) {
//			System.out.println("employee is parttime :");
		
		}
		return attendance;
	}

	
	}
	
	

	
	
	
	

