import java.util.*;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a decimal number ");
        double d = sc.nextDouble();
        int i = (int) d;
        System.out.println("After converting to int " + i);
        System.out.print("Enter a integer value ");
        int i1 = sc.nextInt();
        double d1 = i1;
        System.out.println("After converting to decimal " + d1);
    }
}