package JavaPgm;

import java.util.LinkedHashSet;

public class Remove_character_duplicates_from_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "raining here...";

         String res = "";

         LinkedHashSet<Character> l = new LinkedHashSet<>();

         for (int i = 0; i < str.length(); i++) {

                        char c = str.charAt(i);

                        l.add(c);

         }

         for (Character c : l) {

                        res = res + c;

         }

         

         System.out.println(res);
	}

}
