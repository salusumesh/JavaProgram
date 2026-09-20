package JavaPgm;

import java.util.LinkedHashMap;

public class find_count_of_each_word_in_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "java sql java python ";

         String[] sp = s.split(" ");

         LinkedHashMap<String, Integer> mp = new LinkedHashMap<>();

         for (String st : sp) {

                        if (mp.containsKey(st)) {

                                       Integer i = mp.get(st);

                                       mp.put(st, i + 1);

                        } else {

                                       mp.put(st, 1);

                        }

         }

         System.out.println(mp);
	}

}
