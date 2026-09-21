package JavaPgm;

public class _First_Non_Repeated_Character {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s = "racecar";
	        System.out.println(getFirstNonRepeatedChar(s));
	}
	 public static Character getFirstNonRepeatedChar(String str) {
	        if (str == null || str.isEmpty()) {
	            return null;
	        }

	        int[] frequencies = new int[256]; // Extended ASCII limit

	        // Step 1: Count occurrences
	        for (int i = 0; i < str.length(); i++) {
	            frequencies[str.charAt(i)]++;
	        }

	        // Step 2: Scan the string sequentially to maintain order
	        for (int i = 0; i < str.length(); i++) {
	            if (frequencies[str.charAt(i)] == 1) {
	                return str.charAt(i);
	            }
	        }

	        return null;
	    }
	 public static char nonRep(String s) {
	        int n = s.length();
	        for (int i = 0; i < n; ++i) {
	            boolean found = false;

	            for (int j = 0; j < n; ++j) {
	                if (i != j && s.charAt(i) == s.charAt(j)) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) 
	                return s.charAt(i);
	        }

	        return '$';
	    }

}
