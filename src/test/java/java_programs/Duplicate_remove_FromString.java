package imp_prgm;

public class Duplicate_remove_FromString {

	public static void main(String[] args)
	{
		String s = "karnataka";
		char[] arr = s.toCharArray();
		
		for (int j = 0; j < arr.length; j++)
		{
			for (int i = j + 1; i < arr.length; i++) 
			{
				if (arr[i] == arr[j])
				{
					arr[i] = 'D';
				}
			}
		}

		for (int k = 0; k < arr.length; k++) 
		{
			if (arr[k] != 'D') 
			{
				String d = arr[k]+" ";
				System.out.print(d);
			}
		}
		

	}

}
