
package JavaPgm;
import java.util.*;

public class _Check_Palindrome_A_Number_Or_Not {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ArrayList<Integer> arr
          = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 1));

      System.out.println(isPalindrome(arr));
	}
	 public static boolean
	    isPalindrome(ArrayList<Integer> arr)
	    {
	        int n = arr.size();

	        // Traverse till middle
	        for (int i = 0; i <= n / 2; i++) {

	            // Check for mismatch
	            if (!arr.get(i).equals(arr.get(n - i - 1))) {
	                return false;
	            }
	        }

	        // If all elements match
	        return true;
	    }
}
