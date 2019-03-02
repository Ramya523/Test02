import java.util.Scanner;

public class NetSalary {
	
	public void calculate()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the basic salary");
	float basicsalary=sc.nextFloat();
	double netsal=basicsalary-(0.5*basicsalary)+(0.25*basicsalary)+(0.12*basicsalary);
	System.out.println("net salary="+netsal);
	
	
	
	}
	
	
	
	
	public static void main(String[] args) {
		NetSalary salary= new NetSalary();
		salary.calculate();
		
	}

}
