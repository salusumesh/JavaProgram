package JavaPgm;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class _ReadDataFromTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String filePath = "D:\\Repo\\Salima_Java\\JavaProgram\\JavaInterviewProgram\\src\\JavaPgm\\sample.txt";

	        // Try-with-resources automatically closes the reader
	        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
	            String line;
	            // Read line-by-line until the end of the file (null)
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (IOException e) {
	            System.err.println("Error reading file: " + e.getMessage());
	        }
	}

}
