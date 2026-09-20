package JavaPgm;

public class sort_elements_in_descending_order {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      int[] a = { 55, 20, 60, 90, 15, 35 };

          

          System.out.println("Before sorting");

          for (int i : a) {

                         System.out.println(i);

          }

          

          for (int i = 0; i < a.length; i++) {

                         for (int j = i + 1; j < a.length; j++) {

                                        // Descending order

                                        if (a[i] < a[j]) {

                                                       int temp = a[i];

                                                       a[i] = a[j];

                                                       a[j] = temp;

                                        }

                         }

          }

          System.out.println("After sorting in descending order");

          for (int i : a) {

                         System.out.println(i);

          }
	}

}
