
package JavaPgm;
import java.util.Arrays;
public class _DuplicatesInArrayUsingSorting {

	 // Function to find duplicate
    public static int findDuplicates(int[] arr, int n)
    {
        // sort the array
        Arrays.sort(arr);
        // boolean flag to check if duplicate exists or not
        boolean flag = false;

        // find duplicates by checking adjacent elements
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                flag = true;
                return arr[i];
            }
        }

        // if there is no duplicate
        if (!flag) {
            return -1;
        }
      
          return -1;
    }

    // Driver code
    public static void main(String[] args)
    {
        // Input array
        int[] arr = { 1, 3, 4, 2, 2 };
        int n = arr.length;

        // Function call
        System.out.println(findDuplicates(arr, n));
    }

}
