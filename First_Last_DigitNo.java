package imp_prgm;    //34

public class First_Last_DigitNo {

	public static void main(String[] args)
	{
	  int[]	arr={121, 266, 289};
	  
	  for(int i=0; i<arr.length; i++)
	  {
		  int no =arr[i];
		  System.out.println(  no/100 + " " + no%10 );
		  
	  }
		

	}
	

}
