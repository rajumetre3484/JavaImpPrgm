package imp_prgm;

public class Factorial   //5!=5*4*3*2*1
{

	public static void main(String[] args) 
	{
		int no=5;
		int fact=1;
		for(int i=no; i>=1; i-- ) //5*4*3*2*1=120
		{
			fact=fact*i;
		}
		System.out.println(fact);  //120 
		

	}

}
