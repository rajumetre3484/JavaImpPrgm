package imp_prgm;

public class DecendingOrder_array {

	public static void main(String[] args)
	{
		 int[]arr = {10, 40, 3, 1, 9};
		 for(int j=0; j<=arr.length-1; j++)
		 {
			 for(int i=j+1; i<=arr.length-1; i++)
			 {
				 if(arr[j]<arr[i])
				 {
					 int temp=arr[j];
					 arr[j]=arr[i];
					 arr[i]=temp;
				 }
			 }
		 }
		 for(int k=0; k<=arr.length-1; k++)
		 {
			 System.out.print(arr[k]+" ");
	}
	

	}

}
