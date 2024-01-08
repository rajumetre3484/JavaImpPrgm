package imp_prgm;

public class ArmStrong_Number {

	public static void main(String[] args)
	{
		int no=153; //arm strong number
		//int no=143; // Its not a arm strong number
		int copy=no;
		int sum=0;
		while(no!=0)
		{
			int rem = no%10;
			sum=sum+(rem*rem*rem);
			no=no/10;
					
		}
		if(copy==sum)
		{
			System.out.println("arm strong number");//
		}
		else
		{
			System.out.println("Its not a arm strong number");
		}
		

	}

}
