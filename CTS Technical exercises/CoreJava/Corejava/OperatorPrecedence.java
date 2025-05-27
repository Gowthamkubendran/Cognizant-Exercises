import java.util.*

public class OperatorPrecedence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number ");
        int a = sc.nextInt();
        System.out.print("Enter second number  ");
        int b = sc.nextInt();
        int res1 = a + b * 2;
        System.out.println("a + b * 2 = " + res1);
        int res2 = (a + b) * 2;
        System.out.println("(a + b) * 2 = " + res2);
        int res3 = a / 2 + b;
        System.out.println("a / 2 + b = " + res3);
    }
}
