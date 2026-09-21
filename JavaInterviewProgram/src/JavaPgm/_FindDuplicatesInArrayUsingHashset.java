package JavaPgm;
import java.util.HashSet;
import java.util.Set;
public class _FindDuplicatesInArrayUsingHashset {

	 public static void main(String[] args) {
	        String[] languages = {"Java", "Python", "C++", "Java", "Go", "Python"};
	        
	        // HashSet to store unique elements we have seen so far
	        Set<String> seenElements = new HashSet<>();
	        
	        // HashSet to track distinct duplicates (prevents printing the same duplicate multiple times)
	        Set<String> duplicates = new HashSet<>();

	        System.out.println("Searching for duplicates...");

	        for (String lang : languages) {
	            // If .add() returns false, the element is already in seenElements
	            if (!seenElements.add(lang)) {
	                duplicates.add(lang);
	            }
	        }

	        if (duplicates.isEmpty()) {
	            System.out.println("No duplicate elements found.");
	        } else {
	            System.out.println("Duplicate elements found: " + duplicates);
	        }
	    }
}
