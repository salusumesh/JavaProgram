package JavaPgm;

public class _CountNumberOfOddEvenDigitInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n;
		    n = 2335453;
		    // Function call
		    int t = countEvenOdd(n);
		    if (t == 1) {
		        System.out.println ( "YES" );
		    }
		    else {
		        System.out.println( "NO") ;
		    }
	}
	
	// Function to count digits
	static int countEvenOdd(int n)
	{
	      // Initialize event_count and odd_count
	    int even_count = 0;
	    int odd_count = 0;
	    while (n > 0) 
	    {
	        int rem = n % 10;
	          // if condition is true then increment even_count
	        if (rem % 2 == 0){
	            even_count++;
	        }
	        // increment odd_count
	        else {
	            odd_count++;
	        }
	        n = n / 10;
	    }
	    System.out.println ( "Even count : " + 
	                              even_count);
	    System.out.println ( "Odd count : " + 
	                              odd_count);
	    if (even_count % 2 == 0 && odd_count % 2 != 0){
	        return 1;
	    }
	    else {
	        return 0;
	    }
	}


}
