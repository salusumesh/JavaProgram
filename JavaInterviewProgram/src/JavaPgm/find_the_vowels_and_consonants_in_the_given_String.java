package JavaPgm;

public class find_the_vowels_and_consonants_in_the_given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String str = "All the best";

           String s = str.replace(" ", "");

           String vow = "";

           int v = 0;

           String con = "";

           int co = 0;

           for (int i = 0; i < s.length(); i++) {

                          char c = s.charAt(i);

                          if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O'

                                                        || c == 'U') {

                                         vow = vow + c;

                                         v++;

                          } else {

                                         con = con + c;

                                         co++;

                          }

           }

           System.out.println("Vowels: " + vow);

           System.out.println("vowels count " + v);

           System.out.println("Consonants: " + con);

           System.out.println("Consonants count " + co);
	}

}
