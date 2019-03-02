import java.util.Scanner;

public class FixedAccount{
	static Scanner sc=new Scanner(System.in);
	 static double rate;
	 static float time;
	public void calculateInterest(double r) {
		System.out.println("enter rate  and time");
		rate=sc.nextDouble();
		time=sc.nextFloat();
		System.out.println("enter balance");
		int balance=sc.nextInt();
		double interest=balance+balance*rate*time;
		System.out.println("interest is:"+interest);
	}
	class AccountInterest extends FixedAccount{
	public double calculateInterest(){
		int principle;
		
		
		System.out.println("enter values");
		principle=sc.nextInt();
		
		
		double interest=(principle*time*rate)/100;
		System.out.println("interest is:"+interest);
		return interest;
	}
	}

	public static void main(String[] args) {
		FixedAccount acc=new FixedAccount();
		AccountInterest acc1=acc.new AccountInterest();
		acc.calculateInterest(rate);
		acc1.calculateInterest();
	}

}