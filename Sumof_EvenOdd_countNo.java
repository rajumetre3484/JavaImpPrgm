package imp_prgm;

public class Sumof_EvenOdd_countNo {

	public static void main(String[] args) 
	{
      int count_odd= 0;
       int sum_odd=0;
       int count_even=0;         hgjhbvgcmhg
       int sum_even=0;
       
       for(int i=20; i<=70; i++)
       {
    	   if(i%2==0)
    	   {
    		   count_even++;
    		   sum_even=sum_even+i;
    	   }
    	   else if(1%2==1)
    	   {
    		   count_odd++;
    		   sum_odd=sum_odd+i;
    	   }
       }
       System.out.println(count_odd);
       System.out.println(count_even);
       System.out.println(sum_even);
       System.out.println(sum_odd);
   	
	

	}

}
}
