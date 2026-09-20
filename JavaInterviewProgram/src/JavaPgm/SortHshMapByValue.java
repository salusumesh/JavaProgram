package JavaPgm;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
public class SortHshMapByValue {
//24. Write a Java program that sorts HashMap by value
	public static void main(String[] args) {
		// HashMap is not an ordered collection. The following example code shows how to sort the entries based on value and store them into LinkedHashMap, which maintains the order of insertion:
		Map<String, Integer> scores = new HashMap<>();

		  scores.put("David", 95);
		  scores.put("Jane", 80);
		  scores.put("Mary", 97);
		  scores.put("Lisa", 78);
		  scores.put("Dino", 65);

		  System.out.println(scores);

		  scores = sortByValue(scores);

		  System.out.println(scores);
	}
	private static Map<String, Integer> sortByValue(Map<String, Integer> scores) {
		  Map<String, Integer> sortedByValue = new LinkedHashMap<>();

		  // get the entry set
		  Set<Entry<String, Integer>> entrySet = scores.entrySet();
		  System.out.println(entrySet);

		  // create a list since the set is unordered
		  List<Entry<String, Integer>> entryList = new ArrayList<>(entrySet);
		  System.out.println(entryList);

		  // sort the list by value
		  entryList.sort((x, y) -> x.getValue().compareTo(y.getValue()));
		  System.out.println(entryList);

		  // populate the new hash map
		  for (Entry<String, Integer> e : entryList)
		   sortedByValue.put(e.getKey(), e.getValue());

		  return sortedByValue;
		 }

}
