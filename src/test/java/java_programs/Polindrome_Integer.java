package imp_prgm;

public class Polindrome_Integer {

	public static void main(String[] args) 
	{
		int no=343; int rev=0;
		int copy=no;
		while(no!=0)
		{
			int rem = no%10;
			rev=(rev*10)+rem;
			no=no/10;
		}
		if(rev==copy)
		{
			System.out.println("Its Polindrome");
		}
		else
		{
			System.out.println("Its not a Polindrome");
		}
		

	}

}
