package JavaPgm;

public class _find_count_of_each_digit_in_number {

	public static void main(String[] args) {
		 long number = 1223334444L; // Example number
	        int[] digitCounts = new int[10];

	        // Handle negative numbers
	        long temp = Math.abs(number);

	        // Handle the case where the number itself is 0
	        if (temp == 0) {
	            digitCounts[0] = 1;
	        }

	        // Extract digits and increment frequency
	        while (temp > 0) {
	            int digit = (int) (temp % 10);
	            digitCounts[digit]++;
	            temp /= 10;
	        }

	        // Print the frequency of each digit
	        System.out.println("Digit frequencies for " + number + ":");
	        for (int i = 0; i < digitCounts.length; i++) {
	            if (digitCounts[i] > 0) {
	                System.out.println("Digit " + i + " appears " + digitCounts[i] + " time(s)");
	            }
	        }

	}

}
