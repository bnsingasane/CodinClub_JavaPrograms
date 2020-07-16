echo "Welcome to Employee Wage Computation Problem"

public class employeeWage {

	public static void main(String[] args) {
		int PART_TIME=1;
		int IS_FULL_TIME=1;
		int EMP_WAGE_PER_HR=20;
		int empHrs=0;
		int empWage=0;
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		switch (empCheck)
		{
			case PART_TIME:
				empHrs=4;
				break;
			case FULL_TIME:
				empHrs=8;
				break;
			default:
				empHrs=0;
		}
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("Emp Wage:"+empWage);
	}
}
