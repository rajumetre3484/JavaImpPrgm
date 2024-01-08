package imp_prgm;

import java.util.Scanner;

public class Reverse_Number {

	public static void main(String[] args)
	{
		int no;
		int rev=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		no=sc.nextInt();
		while(no!=0)
		{
			int rem = no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		System.out.println("Reverse number is "+ rev);
		

	}

}
