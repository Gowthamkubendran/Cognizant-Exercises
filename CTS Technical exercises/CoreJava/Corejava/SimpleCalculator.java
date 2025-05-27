/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asvba
 */
import java.util.*;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double n1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double n2 = sc.nextDouble();

        System.out.println("Choose operation: +, -, *, /");
        char opr = sc.next().charAt(0);

        double result;

        if (opr == '+') {
            result = n1 + n2;
        } else if (opr == '-') {
            result = n1 - n2;
        } else if (opr == '*') {
            result = n1 * n2;
        } else if (opr == '/') {
            if (n2 != 0)
                result = n1 / n2;
            else {
                System.out.println("Cannot divide by zero!");
                return;
            }
        } else {
            System.out.println("Invalid operation.");
            return;
        }

        System.out.println("Result: " + result);
    }
}

