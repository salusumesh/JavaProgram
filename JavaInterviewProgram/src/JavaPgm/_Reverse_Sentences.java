package JavaPgm;

public class _Reverse_Sentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseAString();
		ReverseEveryCharacterInString();
	}
	
	public static void ReverseAString() {
		 String sentence = "Java is fun to learn";
	        
	        // Split the sentence into words using space as a delimiter
	        String[] words = sentence.split(" ");
	        StringBuilder reversed = new StringBuilder();

	        // Iterate through the array in reverse order
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversed.append(words[i]);
	            if (i > 0) {
	                reversed.append(" "); // Add space between words
	            }
	        }

	        System.out.println("Original: " + sentence);
	        System.out.println("Reversed Words: " + reversed.toString());
	}
	public static void ReverseEveryCharacterInString() {
	  String sentence = "Hello World";
      
      // Pass the string to StringBuilder and call reverse()
      String reversed = new StringBuilder(sentence).reverse().toString();

      System.out.println("Original: " + sentence);
      System.out.println("Reversed Characters: " + reversed);
}

}
