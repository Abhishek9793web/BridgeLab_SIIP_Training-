import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Checked_Exception {
    public static void main(String[] args) {
        String fileName = "Exceptions\\src\\data";  // File to read

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("File contents:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }

}
