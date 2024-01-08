package imp_prgm;

public class Polindrome_string {

	public static void main(String[] args) 
	{
		String S="MADAM";
		String rev="";
		
		for(int i=S.length()-1; i>=0; i--)
		{
		    rev=rev + S.charAt(i);
		}
		
		
		
		if(S.equals(rev))
		{
			System.out.println("Its a Polindrome");
		}
		else
		{
			System.out.println("Not a plindrome");
		}
	

	}

}
