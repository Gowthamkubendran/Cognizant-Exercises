import java.util.Scanner;
class InvalidAgeException extends Exception {
    private String message;

    public InvalidAgeException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}

public class AgeValidator {

    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("You must be at least 18 years old.");
        } else {
            System.out.println("Access granted. Age is valid.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        try {
            checkAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
