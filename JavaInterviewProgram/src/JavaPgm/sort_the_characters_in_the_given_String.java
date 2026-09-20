package JavaPgm;

public class sort_the_characters_in_the_given_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   String s = "goodday";

           char[] a = s.toCharArray();

           System.out.println("Before sorting");

           for (int i = 0; i < a.length; i++) {

                          System.out.print(a[i]);

           }

           for (int i = 0; i < a.length; i++) {

                          for (int j = i + 1; j < a.length; j++) {

                                         if (a[i] > a[j]) {

                                                        char temp = a[i];

                                                        a[i] = a[j];

                                                        a[j] = temp;

                                         }

                          }

           }

           System.out.println();

           System.out.println("After sorting in descending order");

           for (int i = 0; i < a.length; i++) {

                          System.out.print(a[i]);

           }
	}

}
