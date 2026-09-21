package JavaPgm;
import java.util.LinkedHashSet;
import java.util.Set;
public class _RemoveDuplicateWordFromASentences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String sentence = "Goodbye bye bye world world";
        
        // Split sentence into words
        String[] words = sentence.split("\\s+");
        
        // LinkedHashSet automatically removes duplicates and keeps the order
        Set<String> uniqueWords = new LinkedHashSet<>();
        for (String word : words) {
            uniqueWords.add(word);
        }
        
        // Join the unique words back into a single sentence
        String result = String.join(" ", uniqueWords);
        
        System.out.println("Original: " + sentence);
        System.out.println("Result:   " + result);
	}

}
