package imp_prgm;//32

import java.util.Scanner;

public class Ascii_Values_String 
{

	public static void main(String[] args) 
	{
	/*	String s = "hello";
		for(int i=0; i<=s.length()-1; i++)
		{
			int c=s.charAt(i);
			System.out.println(c);
			//System.out.println( (int)s.charAt(i));
		
		}
			*/
	

		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter String" );
	String v = sc.nextLine();
	for(int i=0; i<=v.length()-1; i++) 
	{
	  int d = v.charAt(i);
	  System.out.println(d);
	}
		
	}

}
