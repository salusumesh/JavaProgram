package JavaPgm;

public class _DuplicateInArrayUsingBruteForceMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Initialize an array with some duplicate values
        int[] numbers = {1, 3, 4, 2, 5, 3, 2, 7};
        
        System.out.println("Duplicate elements found using Brute Force:");
        findDuplicatesBruteForce(numbers);
	}
	public static void findDuplicatesBruteForce(int[] arr) {
        // Check for edge cases
        if (arr == null || arr.length < 2) {
            System.out.println("No duplicates possible.");
            return;
        }

        // Outer loop picks an element one by one
        for (int i = 0; i < arr.length; i++) {
            // Inner loop compares the picked element with the rest of the elements
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println("Duplicate element: " + arr[i]);
                    // Break prevents printing the same pair multiple times if it repeats
                    break; 
                }
            }
        }
    }
}
