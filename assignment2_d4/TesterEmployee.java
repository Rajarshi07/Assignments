package assignment2_d4;

public class TesterEmployee {

	public TesterEmployee() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PermanentEmployee e1=new PermanentEmployee(1,"A",28000.0,14000.0,3);
		ContractEmployee e2=new ContractEmployee(2,"B",1500,8);
		e1.calculateMonthlySalary();
		e2.calculateSalary();
		System.out.println(e1);
		System.out.println(e2);
	}

}
