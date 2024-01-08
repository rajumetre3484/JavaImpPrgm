package imp_prgm;

public class SmallestNo_InArray 
{

	public static void main(String[] args) 
	{
		int[] arr= {10,20,40,35,15};
		
		int smallest=arr[0];
		
		for(int i=0; i<=arr.length-1; i++)
		{
			if(arr[i]<smallest)
			{
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
		
	}

}

