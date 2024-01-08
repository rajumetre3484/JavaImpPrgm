package imp_prgm;

public class Duplicate_remove_FromSentence {

	public static void main(String[] args)
	{
       String s = {"hi" "hello" "hi" "hello" "bye"};
		
		String[] arr = s.split(" ");
		
		for (int j = 0; j < arr.length; j++)
		{
			for (int i = j + 1; i < arr.length; i++) 
			{
				if (arr[i] == arr[j])
				{
					arr[i] = "Dii";
				}
			}
		}

		for (int k = 0; k < arr.length; k++) 
		{
			if (arr[k] != "Dii") 
			{
				System.out.print(arr[k]+ " ");
			}
		}
	}

}
