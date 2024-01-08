package imp_prgm;

public class Reverse_String_Split_1 {

	public static void main(String[] args)
	{
		String S = "Nanna mansalli ninge jaaga illa";
		String[] arr = S.split(" ");
		
		for(int i=arr.length-1; i>=0; i--)
		{
			if(i==2)
			{
				String S1 = arr[i];
				String rev = " ";
				for(int K=S1.length()-1; K>=0; K--)
				{
					rev=rev+S1.charAt(K);
				}
				System.out.print(rev+ " ");
			}
			else
			{
				System.out.print(arr[i]+ " ");
		}
		

		}}}


