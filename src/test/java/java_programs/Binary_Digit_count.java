package imp_prgm;  //35

public class Binary_Digit_count {

	public static void main(String[] args) 
	{
		int no=101261;
		int count=0;
		while(no!=0)
		{
			int rem = no%10; // gives remender
		
			if(rem == 0 || rem == 1) // binary means 0 or 1
			{
				count++;
			}
		      no=no/10;  // here removes the last digit of the no
		}
		System.out.println(count);
	

	}

}
