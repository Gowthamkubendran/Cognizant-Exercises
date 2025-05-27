import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println(str+" is a palindrome.");
        } else {
            System.out.println(str+" is not a palindrome.");
        }
    }
}