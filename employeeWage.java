
echo "Welcome to Employee Wage Computation Problem"

public class employeeWage {

	public static void main(String[] args) {
		int IS_FULL_TIME=1;
		int EMP_WAGE_PER_HR=20;
		int empHrs=0;
		int empWage=0;
		double empCheck=Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME)
			empHrs=8;
		else
			empHrs=0;
		empWage=empHrs*EMP_RATE_PER_HR;
		System.out.println("Emp Wage:"+empWage);
	}
}
