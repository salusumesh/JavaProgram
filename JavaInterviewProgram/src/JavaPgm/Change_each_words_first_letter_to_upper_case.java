package JavaPgm;

public class Change_each_words_first_letter_to_upper_case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "welcome to java class";

        String[] sp = str.split(" ");

        String res = "";

        for (String s : sp) {

                       char c = s.charAt(0);

                       String sub = s.substring(1);

                       res = res + Character.toUpperCase(c) + sub + " ";

        }

        System.out.println(res);
	}

}
