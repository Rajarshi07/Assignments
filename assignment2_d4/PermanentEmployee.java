package assignment2_d4;

public class PermanentEmployee extends Employee {
	double basicPay,hra;
	float experience;
	public PermanentEmployee(int employeeId, String employeeName, double basicPay, double hra, float experience) {
		super(employeeId, employeeName);
		this.basicPay = basicPay;
		this.hra = hra;
		this.experience = experience;
	}
	public double getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public float getExperience() {
		return experience;
	}
	public void setExperience(float experience) {
		this.experience = experience;
	}
	public void calculateMonthlySalary() {
		double vc=0;
		if(experience>=10)vc=0.12*basicPay;
		else if(experience>=5)vc=0.07*basicPay;
		else if(experience>=3)vc=0.05*basicPay;
		setSalary(vc+basicPay+hra);		
	}
	@Override
	public String toString() {
		return "PermanentEmployee [basicPay=" + basicPay + ", hra=" + hra + ", experience=" + experience
				+ ", employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

}
