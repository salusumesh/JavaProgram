package JavaPgm;

public class _SumOfElementsInArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {5, 10, 15, 20, 25};
	        int sum = 0;

	        // Iterate through each element in the array
	        for (int num : numbers) {
	            sum += num;
	        }

	        System.out.println("The sum is: " + sum); 
	        // Output: The sum is: 75
	}
}
