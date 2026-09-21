package JavaPgm;

public class _ExtractLastFourCharacterFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String input = "HelloWorld";
	        String result = "";

	        if (input != null && input.length() >= 4) {
	            result = input.substring(input.length() - 4);
	        } else {
	            result = input; // Returns the full string if it's less than 4 characters
	        }

	        System.out.println(result); // Output: orld
	}

}
