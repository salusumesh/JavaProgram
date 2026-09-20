package JavaPgm;

public class FactiorialOfAnInteger {
//12. How can you find the factorial of an integer in Java?
	public static void main(String[] args) {
		// The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number:
		long factorialValue = factorial(10);
		 System.out.print(factorialValue);
	}
	public static long factorial(long n) {
		 if (n == 1)
		  return 1;
		 else
		  return (n * factorial(n - 1));
		}
}
