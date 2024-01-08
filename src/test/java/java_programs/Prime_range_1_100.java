package imp_prgm;

public class Prime_range_1_100 {

	public static void main(String[] args) {
		for (int j = 1; j <= 100; j++) {
			int no = j;
			int count = 0;
			for (int i = 1; i <= no; i++) {
				if (no % i == 0) {
					count++;
				}
			}

			if (count == 2) {
				System.out.println("Its a prime no"+no);
			} 
			
		/*	else {
				System.out.println("not prime number"+no);
			} */

		}
	}
}
