package imp_prgm;

public class Fibonacci_series_MethodwithParameters
{
	static void fibo (int fib1, int fib2)
	{
		System.out.println(fib1+" "+ fib2+" ");
		
		for(int i=1; i<=10; i++)
		{
			int fib3 = fib1+fib2;
			fib1=fib2;
			fib2=fib3;
			System.out.print(fib3+" ");
		}
	}

	public static void main(String[] args) 
	{
	 fibo(0,1) ;
		

	}

}
