package imp_prgm;  //30

public class Sepaerate_Num_alphbets_SplChar_verify 
{

	public static void main(String[] args) 
	{
		char ch = 'R';
		if(ch>='A' && ch<='Z')
		{
			System.out.println("Its UpperCse character : " + ch);
		}
		else if(ch>='a' && ch<='z')
		{
			System.out.println("Its LowerCase character : " + ch);
		}
		else
		{
			System.out.println("Its is Special character");
		}
		

	}

}
