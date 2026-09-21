package JavaPgm;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
public class _WriteDataInToTextFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String data = "Hello, World!\nWelcome to Java file writing.";
	        Path filePath = Path.of("D:\\Repo\\Salima_Java\\JavaProgram\\JavaInterviewProgram\\src\\JavaPgm\\output.txt");
	        System.out.println(filePath);
	        try {
	            // Overwrites the file if it exists, or creates a new one
	            Files.writeString(filePath, data);
	            
	            // OPTIONAL: To append data instead of overwriting, use this line instead:
	            // Files.writeString(filePath, data, StandardOpenOption.CREATE, StandardOpenOption.APPEND);
	            
	            System.out.println("Successfully written to file.");
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}

}
