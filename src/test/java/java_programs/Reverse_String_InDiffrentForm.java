package imp_prgm;  //36

public class Reverse_String_InDiffrentForm {

	public static void main(String[] args) 
	{
		//1. Using+ (String Concatenation) operator
		
		String str = "ABCD";
		String rev=" ";
		
	/*	for(int i=str.length()-1; i>=0; i--)//3 2 1 0
		{
			rev=rev+str.charAt(i);//DCBA
		}
		System.out.println(rev);  */
		
		
		//2. Using Charactor Array
		
	/*	char[] a = str.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{
			
			rev=rev+a[i];
		}
		System.out.println(rev);  */
		
		
		//3. Using StringBuffer class
		 StringBuffer sb = new StringBuffer(str);
		 System.out.println(sb.reverse());
	

	}

}
