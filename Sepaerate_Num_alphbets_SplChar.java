package imp_prgm; //29

public class Sepaerate_Num_alphbets_SplChar {

	public static void main(String[] args) {
		String S = "Su12d#e@ep";
		String a = " ";
		String b = " ";
		String c = " ";
		String d = " ";

	/*	for (int i = 0; i <= S.length() - 1; i++) {
			char ch = S.charAt(i);
			if ((ch >= 65) && (ch <= 90)) // upper case
			{
				a = a + ch;
			} else if ((ch >= 97) && (ch <= 122)) // lower case
			{
				b = b + ch;
			} else if ((ch >= 48) && (ch <= 57)) // number
			{
				c = c + ch;
			} else {
				d = d + ch; // remaining spl char
			}
		}
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);  */

	for(int i=0; i<=S.length()-1; i++)
	{
		char ch = S.charAt(i);
		if(Character.isUpperCase(ch))
		{
			a=a+ch;
		}
		else if(Character.isLowerCase(ch))
		{
			b=b+ch;
		}
		else if(Character.isDigit(ch))
		{
			c=c+ch;
		}
		else
		{
			d=d+ch;
		}
	}
		
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);	
			
	}

}
