package JavaPgm;

public class _RemoveJunkOrSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String junkString = "Hello@! World#123_$%";
        
        // Removes all special characters, punctuation, and spaces
        String cleanString = junkString.replaceAll("[^a-zA-Z0-9]", "");
//The regex shortcut \\w matches any alphanumeric character plus the underscore (_). If you want to keep letters, numbers, underscores, and spaces, you can
      //  String cleanString = junkString.replaceAll("[^\\w\\s]", "");
        System.out.println(cleanString); 
        // Output: HelloWorld123
	}

}
