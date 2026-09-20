package JavaPgm;

public class CheckVowelPresentInStringOrNot {
//3 .Write a Java program to check if a vowel is present in a string
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(stringContainsVowels("Hello")); // true
		  System.out.println(stringContainsVowels("TV")); // false
	}
	public static boolean stringContainsVowels(String input) {
		/*use a regular expression to check whether the string contains vowels:*/
		  return input.toLowerCase().matches(".*[aeiou].*");
		 }
}
