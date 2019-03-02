import java.util.Scanner;

import java.util.Scanner;
class InputValidException extends Exception {
	InputValidException(String message){
		System.out.println(message);
	}
}
public class Age {
	
	public void check() throws InputValidException 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter employee details");
		String name=sc.next();
		int age,mobileno;
		mobileno=sc.nextInt();
		age=sc.nextInt();
		if(age<20 || age>55) {
			System.out.println("valid user");
		}
		else {
			throw new InputValidException("invalid user");
		}
	}

	public static void main(String[] args) throws InputValidException {
		Age employee=new Age();
		employee.check();

	}

}
