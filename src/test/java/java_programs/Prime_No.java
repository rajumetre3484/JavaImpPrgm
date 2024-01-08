package imp_prgm;

public class Prime_No {

	public static void main(String[] args)
	{
		int no = 5;
		int count = 0;
		for (int i = 1; i <= no; i++) 
		{
			if (no % i == 0)
			{
				count++;
			}
		}
			if (count == 2)
			{
				System.out.println("Its prime Number");
			} 
			else 
			{
				System.out.println("Its not a prime Number");
			}
		}

	}


