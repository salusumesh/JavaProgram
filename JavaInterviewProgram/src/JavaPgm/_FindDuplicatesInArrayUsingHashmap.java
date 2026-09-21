package JavaPgm;
import java.util.HashMap;
import java.util.Map;
public class _FindDuplicatesInArrayUsingHashmap {

	public static void main(String[] args) {
        // Sample array with duplicate values
        int[] numbers = {4, 5, 6, 4, 7, 8, 5, 9, 4};
        
        System.out.println("Duplicate elements in the array are:");
        findDuplicatesUsingHashMap(numbers);
    }

    public static void findDuplicatesUsingHashMap(int[] arr) {
        // 1. Create a HashMap to store array elements and their frequency counts
        Map<Integer, Integer> elementCountMap = new HashMap<>();

        // 2. Traverse the array and populate the map
        for (int element : arr) {
            // Using getOrDefault to safely increment the existing count or initialize with 0
            elementCountMap.put(element, elementCountMap.getOrDefault(element, 0) + 1);
        }

        // 3. Iterate through the map entries to find keys with a value > 1
        boolean hasDuplicates = false;
        for (Map.Entry<Integer, Integer> entry : elementCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + " | Occurrences: " + entry.getValue());
                hasDuplicates = true;
            }
        }

        if (!hasDuplicates) {
            System.out.println("No duplicate elements found.");
        }
    }

}
