package JavaPgm;

import java.util.TreeSet;

public class remove_the_duplicates_and_to_sort_elements_from_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] a = { 55, 39, 26, 78, 55, 99, 30 };

        TreeSet<Integer> t = new TreeSet<>();

        for (int i = 0; i < a.length; i++) {

                       t.add(a[i]);

        }

        System.out.println(t);
	}

}
