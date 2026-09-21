package JavaPgm;

public class _SumOfADigitInNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int number = 12345;
	        int sum = 0;

	        // Loop until the number becomes 0
	        while (number > 0) {
	            sum += number % 10;  // Extract the last digit and add to sum
	            number /= 10;        // Remove the last digit
	        }

	        System.out.println("Sum of digits: " + sum); 
	        // Output: Sum of digits: 15
	}

}
