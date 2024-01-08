package imp_prgm;  //31

public class Convert_StringtoInteger {

	public static void main(String[] args)
	{
		String c = "143";
		int x = Integer.parseInt(c);
		
		int sum=0;
		while(x!=0)
		{
			int rem = x%10;
			sum=sum+rem;
			x=x/10;
		}
		System.out.println(sum);
	

	}

}
