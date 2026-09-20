package JavaPgm;

public class FibbonocciSequence {
//5. Write a Java program to print a Fibonacci sequence  
	public static void main(String[] args) {
 
//A Fibonacci sequence is one in which each number is the sum of the two previous numbers. In this example, the sequence begins with 0 and 1. 
		
		printFibonacciSequence(10);
	}
	public static void printFibonacciSequence(int count) {
		  int a = 0;
		  int b = 1;
		  int c = 1;

		  for (int i = 1; i <= count; i++) {
		   System.out.print(a + ", ");

		            a = b;
		   b = c;
		   c = a + b;
		  }
		 }
}
