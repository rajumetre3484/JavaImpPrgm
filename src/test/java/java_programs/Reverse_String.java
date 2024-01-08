package imp_prgm;

public class Reverse_String {

	public static void main(String[] args)
	{
		String S="Raj-Ravi";
		String rev="";
		
		for(int i=S.length()-1; i>=0; i--)
		{
		    rev=rev + S.charAt(i);
		}
		System.out.println(rev);
		
		
		

	}

}
