package imp_prgm;

public class LargestNo_InArray {

	public static void main(String[] args) 
	{
		int[] arr= {10,20,40,35,15};
		
		int largest=arr[0];
		
		for(int i=0; i<=arr.length-1; i++)
		{
			
			if(arr[i]>largest)
			{
				largest=arr[i];
			}
		}
		System.out.println(largest);
		

	}

}
