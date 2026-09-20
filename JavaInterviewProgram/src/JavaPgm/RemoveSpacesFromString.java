package JavaPgm;

public class RemoveSpacesFromString {
//8 How do you remove spaces from a string in Java?
	public static void main(String[] args) {
		String str = " Sumesh N"; 
		System.out.println(str);
		String strWithOtSpace = removeWhiteSpaces(str); 
		System.out.println(strWithOtSpace);
//The following example code shows one way to remove spaces from a string using with the Character.isWhitespace()
	}
	static String removeWhiteSpaces(String input) {
		 StringBuilder output = new StringBuilder();
		 
		 char[] charArray = input.toCharArray();
		 
		 for (char c : charArray) {
		  if (!Character.isWhitespace(c))
		   output.append(c);
		 }
		 
		 return output.toString();
		}
}
