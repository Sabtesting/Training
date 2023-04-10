package samplejavaprograms;

public class EmployeeSalary
	{
		float basicpay,deduction,bonus;
		float hra,pf;

		public EmployeeSalary(float basicpay,float deduction,float bonus)
		{
		this.basicpay=basicpay;
		this.deduction=deduction;
		this.bonus=bonus;
		}

		public void calculate()
		{
		System.out.println("Basic pay: "+basicpay);
		hra=basicpay*5/100;
		System.out.println("HRA: "+hra);
		pf=basicpay*20/100;
		System.out.println("PF: "+pf);
		System.out.println("Bonus Amount: "+bonus);
		System.out.println("Deductions if any: "+deduction);
		}
		
		public void totalsal()
		{
		float salary;
		salary=basicpay+hra+bonus-pf;
		System.out.println("Total salary is:" +salary);
		}

		public static void main(String[] args)
		{
		EmployeeSalary emp=new EmployeeSalary(20000f,500f,5000f);

		System.out.println("Employee");
		emp.calculate();
		emp.totalsal();

	}

}
