package assignment2_d4;

public class ContractEmployee extends Employee {
	double wage;
	float hoursWorked;
	public ContractEmployee(int employeeId, String employeeName, double wage, float hoursWorked) {
		super(employeeId, employeeName);
		this.wage = wage;
		this.hoursWorked = hoursWorked;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public float getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(float hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public void calculateSalary() {
		setSalary(wage*hoursWorked);
	}
	@Override
	public String toString() {
		return "ContractEmployee [wage=" + wage + ", hoursWorked=" + hoursWorked + ", employeeId=" + employeeId
				+ ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

}
