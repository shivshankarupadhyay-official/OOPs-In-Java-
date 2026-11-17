
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FileReader {
    public static void main(String[] args) {

        try {
            // Create a File object
            File r = new File("abc.txt");

            // Create Scanner object to read the file
            Scanner sc = new Scanner(r);

            // Read file line by line
            while (sc.hasNextLine()) {

                // Print the next line from the file
                System.out.println(sc.nextLine());
            }

            // Close Scanner
            sc.close();
        }

        catch (IOException e) {
            // Handle file-related exceptions
            System.out.println("Exception Handled.....!");
        }
    }
}
