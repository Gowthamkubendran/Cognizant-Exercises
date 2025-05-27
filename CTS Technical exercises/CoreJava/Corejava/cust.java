import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class cust {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string to write to the file: ");
        String input = scanner.nextLine();

        try {
            FileWriter fileWriter = new FileWriter("output.txt");
            fileWriter.write(input);
            fileWriter.close();
            System.out.println("Data has been written to output.txt successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }

        scanner.close();
    }
}





/*import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFileWithScanner {
    public static void main(String[] args) {
        try {
            File file = new File("output.txt");
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







import java.util.ArrayList;
import java.util.Scanner;

public class SimpleStudentList {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many student names do you want to add? ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            String name = scanner.nextLine();
            studentNames.add(name);
        }

        System.out.println("\nStudents entered:");
        for (String name : studentNames) {
            System.out.println(name);
        }

        scanner.close();
    }
}







import java.util.HashMap;

public class SuperSimpleStudentMap5 {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();

        // Add 5 students
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");
        students.put(5, "Eva");

        // Display all 5 students
        System.out.println("Student List:");
        System.out.println("ID 1: " + students.get(1));
        System.out.println("ID 2: " + students.get(2));
        System.out.println("ID 3: " + students.get(3));
        System.out.println("ID 4: " + students.get(4));
        System.out.println("ID 5: " + students.get(5));
    }
}

*/