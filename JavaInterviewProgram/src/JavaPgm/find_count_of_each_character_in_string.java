package JavaPgm;

import java.util.LinkedHashMap;

public class find_count_of_each_character_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "raining here...";

        char[] c = s.toCharArray();

        LinkedHashMap<Character, Integer> mp = new LinkedHashMap<>();

        for (char d : c) {

                       if (mp.containsKey(d)) {

                                      Integer i = mp.get(d);

                                      mp.put(d, i + 1);

                       }

                       

                       else {

                                      mp.put(d, 1);

                       }

        }

        

        System.out.println(mp);
	}

}
