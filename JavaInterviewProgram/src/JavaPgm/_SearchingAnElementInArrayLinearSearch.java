package JavaPgm;

public class _SearchingAnElementInArrayLinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {10, 50, 30, 70, 80, 20, 90, 40};
	        int target = 30;

	        // Call the search method
	        int result = linearSearch(numbers, target);

	        // Print the result
	        if (result == -1) {
	            System.out.println("Element " + target + " is not present in the array.");
	        } else {
	            System.out.println("Element " + target + " found at index: " + result);
	        }
	}
	public static int linearSearch(int[] arr, int target) {
        // Loop through every element in the array
        for (int i = 0; i < arr.length; i++) {
            // Check if the current element matches the target
            if (arr[i] == target) {
                return i; // Return the index if found
            }
        }
        // Return -1 if the element is not present in the array
        return -1;
    }

}
