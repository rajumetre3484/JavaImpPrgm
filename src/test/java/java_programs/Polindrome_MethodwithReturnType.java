package imp_prgm;

public class Polindrome_MethodwithReturnType 
{
	boolean pali(int no)
	{
		int copy = no;
		int rev = 0;

		while (no != 0) 
		{
			int rem = no % 10;
			rev = (rev * 10) + rem;
			no = no / 10;
		}

		if (copy == rev)
		{
			return true;
		} 
		else
		{
			return false;
		}
	}

	public static void main(String[] args)
	{

		Polindrome_MethodwithReturnType p = new Polindrome_MethodwithReturnType();
		System.out.println(p.pali(145));

	}

}
