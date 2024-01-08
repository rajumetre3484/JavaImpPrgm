package imp_prgm;

import java.util.Scanner;

public class Polindrome_Scanner {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String:");
		
		String str = sc.next();
		//String org_str =str;
		
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev+str.charAt(i);
		}
			
		if(str.equals(rev))
		{
			System.out.println("its a polindrome");
		}
		else
		{
			System.out.println("Not a Polindrome");
		}

	}

}
