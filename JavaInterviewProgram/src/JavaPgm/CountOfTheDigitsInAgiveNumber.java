package JavaPgm;

public class CountOfTheDigitsInAgiveNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    int num = 15345;

        int count = 0;

        while (num > 0) {

                       count++;

                       num = num / 10;

                       

        }

        System.out.println("Count of digits: " + count);
	}

}
