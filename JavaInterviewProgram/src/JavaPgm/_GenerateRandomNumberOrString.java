package JavaPgm;
import java.util.Random;
public class _GenerateRandomNumberOrString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Random rand = new Random();

	        // Random integer between 0 (inclusive) and 100 (exclusive)
	        int randInt = rand.nextInt(100); 
	        
	        // Random integer between 5 (inclusive) and 15 (exclusive)
	        int boundedInt = rand.nextInt(15 - 5) + 5; 

	        System.out.println("Bounded Int: " + boundedInt);
	        
	        String randomStr = generateRandomString(10);
	        System.out.println("Random String: " + randomStr);
	}
	 private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

	    public static String generateRandomString(int length) {
	        Random random = new Random();
	        StringBuilder sb = new StringBuilder(length);

	        for (int i = 0; i < length; i++) {
	            int randomIndex = random.nextInt(CHARACTERS.length());
	            sb.append(CHARACTERS.charAt(randomIndex));
	        }

	        return sb.toString();
	    }

}
