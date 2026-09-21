package JavaPgm;
import java.util.Scanner;
public class _FindLargestOf3Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter three numbers: ");
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	        int num3 = scanner.nextInt();

	        // Using >= to correctly handle duplicate or identical numbers
	        if (num1 >= num2 && num1 >= num3) {
	            System.out.println(num1 + " is the largest number.");
	        } else if (num2 >= num1 && num2 >= num3) {
	            System.out.println(num2 + " is the largest number.");
	        } else {
	            System.out.println(num3 + " is the largest number.");
	        }

	        scanner.close();
	        
	        /*
	        int a = 15, b = 27, c = 12;

	        // Nested ternary operator to find the greatest value
	        int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);

	        System.out.println("The largest number is: " + largest);*/
	}

}
