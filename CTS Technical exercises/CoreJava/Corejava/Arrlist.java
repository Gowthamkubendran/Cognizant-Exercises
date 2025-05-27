import java.util.ArrayList;
import java.util.Scanner;

public class Arrlist {
    public static void main(String[] args) {
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many student names  you want to add ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
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