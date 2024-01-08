package imp_prgm;

public class Bubble_sort 
{
	public static void main(String[] args) 
	{
	 int[] arr={10, 40, 3, 1, 9};
	 
	 for(int j=0; j<=arr.length-1; j++)
	 {
		 for(int i=0; i<arr.length-1; i++)
		 {
			 if(arr[i]>arr[i+1])
			 {
				 int temp=arr[i];
			     arr[i]=arr[i+1];
			      arr[i+1]=temp;
			 }
		 }
		 
	 }
	
	 for(int k=0; k<=arr.length-1; k++)
	 {
		 System.out.print(arr[k]+" ");
	 }
	 
		
	}
	

}
