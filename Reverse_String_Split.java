package imp_prgm;

public class Reverse_String_Split 
{
	public static void main(String[] args) 
	{
		String s = "My name is Raj";
		String[] arr = s.split(" ");
		for(int i=arr.length-1; i>=0; i--)
		{
			System.out.print(arr[i]+ " ");
		}
		
	}

}
