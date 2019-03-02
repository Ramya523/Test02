import java.util.Scanner;

public class Largest {
	
	static int get(int number, int digit)
    {
		char c = Integer.toString(digit).charAt(0);
        for (int i = number; i > 0; --i)
        {
            if(Integer.toString(i).indexOf(c) == -1)
            {
                return i;
            }
        }
        return -1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number");
		int number=sc.nextInt();
		System.out.println("enter the digit ");
		int digit=sc.nextInt();
		
		System.out.println("answer="+get(number, digit));
		 
      

	}

}
