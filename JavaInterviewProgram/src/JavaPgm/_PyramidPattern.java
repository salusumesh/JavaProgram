package JavaPgm;

public class _PyramidPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StarPyramidPattern();
		NumberPyramidPattern();
		printLeftSideStars(5);
		printTriangle(5);
		printStarsRIght(5);
		printNums(5);
		printContinousNums(5);
	}
	public static void StarPyramidPattern() {
		  int rows = 5; // Total layers of the pyramid

	        for (int i = 1; i <= rows; i++) { // Outer loop for rows
	            
	            // 1. Inner loop to print leading spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            
	            // 2. Inner loop to print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            
	            // Move to the next line after completing a row
	            System.out.println();
	        }
	}
	public static void NumberPyramidPattern() {
		  int rows = 5; // Total layers of the pyramid

	        for (int i = 1; i <= rows; i++) { // Outer loop for rows
	            
	            // 1. Inner loop to print leading spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            
	            // 2. Inner loop to print number
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print(i); // Prints the current row number
	            }
	            
	            // Move to the next line after completing a row
	            System.out.println();
	        }
	}
	static void printLeftSideStars(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
	 static void printTriangle(int n) {
	        for (int i = 0; i < n; i++) {

	            for (int j = n - i; j > 1; j--) {
	                System.out.print(" ");
	            }

	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	 
	 static void printStarsRIght(int n) {
	        for (int i = 0; i < n; i++) {

	            for (int j = 2 * (n - i); j >= 0; j--) {
	                System.out.print(" ");
	            }

	            for (int j = 0; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	    }
	 static void printNums(int n) {
	        for (int i = 0; i < n; i++) {
	            int num = 1;
	            for (int j = 0; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	    }
	 static void printContinousNums(int n) {
	        int num = 1;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(num + " ");
	                num++;
	            }
	            System.out.println();
	        }
	    }
}
