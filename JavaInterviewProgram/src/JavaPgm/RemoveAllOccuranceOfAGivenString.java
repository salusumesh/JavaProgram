package JavaPgm;

public class RemoveAllOccuranceOfAGivenString {
//25. How do you remove all occurrences of a given character from an input string in Java?
	public static void main(String[] args) {
		// The String class doesn’t have a method to remove characters. The following example code shows how to use the replace() method to create a new string without the given character
		String str1 = "abcdABCDabcdABCD";
		  
		str1 = str1.replace("a", ""); 

		System.out.println(str1); // bcdABCDbcdABCD
	}

}
