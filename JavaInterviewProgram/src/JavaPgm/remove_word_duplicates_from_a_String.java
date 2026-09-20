package JavaPgm;

import java.util.LinkedHashSet;

public class remove_word_duplicates_from_a_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "java sql java python java python";

         String res = "";

         LinkedHashSet<String> l = new LinkedHashSet<>();

         String[] sp = str.split(" ");

         for (String s : sp) {

                        l.add(s);

         }

         for (String x : l) {

                        res = res + x+" ";

         }

         

         System.out.println(res);
	}

}
