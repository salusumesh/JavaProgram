package JavaPgm;

public class _LargestAndSmallestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Example array
        int[] numbers = {12, 35, 1, 10, 34, 1};
        
        // Edge case: check if array is empty
        if (numbers == null || numbers.length == 0) {
            System.out.println("Array is empty.");
            return;
        }

        // Initialize smallest and largest with the first element
        int smallest = numbers[0];
        int largest = numbers[0];

        // Traverse the array starting from the second element
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i]; // Update largest
            } else if (numbers[i] < smallest) {
                smallest = numbers[i]; // Update smallest
            }
        }

        // Output results
        System.out.println("Smallest Element: " + smallest);
        System.out.println("Largest Element: " + largest);
	}

}
