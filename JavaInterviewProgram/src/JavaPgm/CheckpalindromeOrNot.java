package JavaPgm;

public class CheckpalindromeOrNot {
//7. How do you check whether a string is a palindrome in Java?
	public static void main(String[] args) {
		// A palindrome string is the same string backwards or forwards. To check for a palindrome, you can reverse the input string and check if the result is equal to the input.
		String txt = "malayalam";
		  System.out.println(checkPalindromeString(txt)); // false
	}
	static boolean checkPalindromeString(String input) {
		 boolean result = true;
		 int length = input.length();

		 for (int i = 0; i < length/2; i++) {
		  if (input.charAt(i) != input.charAt(length - i - 1)) {
		   result = false;
		   break;
		  }
		 }

		 return result;
		}
}
