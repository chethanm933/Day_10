package EmployeeWage;

public class EmployeeWageComputation {
	
	final static int fulltime = 1;
	final static int parttime = 2;
	
	static String empname;
	static String company_name;
	static int working_hour;
	static int max_working_hour;
	static int max_working_day;
	static int wage_hour;
	

	
	public void Employee(String empname, String company_name, int working_hour, int max_working_hour, int max_working_day, int wage_hour) {
	
		this.empname = empname;
		this.company_name = company_name;
		this.working_hour =  working_hour;
		this.max_working_hour = max_working_hour;
		this.max_working_day = max_working_day;
		this.wage_hour = wage_hour;
		
		
		
	}
	
	
	public int wageCalculate() {
		
		EmployeeUC1 emp = new EmployeeUC1();
		
		EmployeeUC2 emp1 = new EmployeeUC2();
		
		
		int total_wrk_hr = 0;
		int days = 0;
		int total_wage;
		int daily_wage;
		
		while((days < max_working_day) && (total_wrk_hr) < max_working_hour) {
			days++;
			int working_hr =  emp1.employeeWageUC2(emp.PartTimeFullTime(fulltime, parttime));
			total_wrk_hr += working_hr;
			daily_wage = working_hr * wage_hour;
			System.out.println(empname+"\tearned a wage"+daily_wage+"\tfor"+days);
			
		}
			
			total_wage = total_wrk_hr * wage_hour;
//			System.out.println("the salary earned by the "+empname+"from the "+company_name+"is"+total_wage+"for this month and worked for"+days+"days and total working hour is"+total_wrk_hr );
////			System.out.println("the total salary earned by the :"+empname+total_wage+ "\tfor\t"+days+"days of work");
////			System.out.println("total_wrk_hr is :"+total_wrk_hr);
			System.out.println("---------------------------");
			return total_wage;
			
	}
	
	@Override
	public String toString() {
		return "EmployeeWageComputation [total_wage=" + this.wageCalculate() + "earned by the employee" + this.empname + "from the " +this.company_name +"]";
	}

	public static void main(String[] args) {
	
	EmployeeWageComputation infy = new EmployeeWageComputation();
	infy.Employee("Kiran", "infosys", 8, 80, 25, 50);
	System.out.println(infy);
	
	System.out.println("-----------------------");
	
	EmployeeWageComputation TCS = new EmployeeWageComputation();
	TCS.Employee("VINOD", "TCS", 10, 100, 30, 100);
	System.out.println(TCS);
	
	
	System.out.println("-----------------------");
	
	EmployeeWageComputation ACCENTURE = new EmployeeWageComputation();
	ACCENTURE.Employee("SANTHOSH","ACCENTURE",12,150 , 150,80);
	System.out.println(ACCENTURE);
	
	}
}


