package imp_prgm;

public class Duplicate_remove_inArray_WithoutUsingCollection {

	public static void main(String[] args)
	{
		int[] arr= {10,20,40,10,20,60};
		
		for(int j=0; j<=arr.length-1; j++)
		{
			for(int i=j+1; i<=arr.length-1; i++)
			{
				if(arr[i]==arr[j])
				{
					arr[i]=143;
				}
			}
		}
		
		for(int k=0; k<=arr.length-1; k++)
		{
			if(arr[k]!=143)
			{
				System.out.print(arr[k]+" ");
			}
		}
		

	}

}
