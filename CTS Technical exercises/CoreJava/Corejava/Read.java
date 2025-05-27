import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Read {
    public static void main(String[] args) {
        try {
            File file = new File("output1.txt");
            Scanner scanner = new Scanner(file);

            System.out.println("Contents of output.txt:");
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: output.txt");
        }
    }
}
