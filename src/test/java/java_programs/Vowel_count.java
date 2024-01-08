package imp_prgm;

public class Vowel_count {

	public static void main(String[] args) 
	{
		String S = "java ice ceam ";
		int count=0;
		for(int i=0; i<S.length(); i++)
		{
			char ch = S.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u' )
			{
				count++;
			}
		}
		System.out.print (count);
	

	}

}
