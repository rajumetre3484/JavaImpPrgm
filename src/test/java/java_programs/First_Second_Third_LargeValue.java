package imp_prgm;   //32

public class First_Second_Third_LargeValue {

	public static void main(String[] args) 
	{
	  int[]arr= {10, 20, 40, 70, 15};
		
		int first=0;
		int second=0;
		int third=0;
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]>first)
			{
				second=first;
				third=second;
				first=arr[i];
			}
			else if(arr[i]>second)
			{
				third=second;
				second=arr[i];
			}
			else
			{
				third=arr[i];
			}
		}
			System.out.println(first);
			System.out.println(second);
			System.out.println(third);
		
         
	}

}
