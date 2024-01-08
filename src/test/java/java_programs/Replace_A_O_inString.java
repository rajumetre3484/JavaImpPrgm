package imp_prgm;  //28

public class Replace_A_O_inString {

	public static void main(String[] args) 
	{
		String s1 = "java";
		
	/*	String H = s1.replace('a', 'o');
		System.out.println(H); */
		
		    String s2 = " ";
		char[] arr = s1.toCharArray(); 
		for(int i=0; i<=s1.length()-1; i++)
		{
			
			if(arr[i]=='a')
			{
		      s2 =s2 +'o';
			}
			else
			{
				s2=s2+arr[i];
				
			}
			
		} 
		
		System.out.println(s2);
	}

}
