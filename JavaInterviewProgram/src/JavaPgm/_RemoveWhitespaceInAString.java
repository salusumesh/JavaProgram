package JavaPgm;

public class _RemoveWhitespaceInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String text = "  Java \t is \n fun  ";
	        
	        // \\s matches any whitespace; + matches one or many consecutive spaces
	        String noSpaces = text.replaceAll("\\s+", "");
	        
	        System.out.println(noSpaces); 
	        // Output: "Javaisfun"
	}

}
