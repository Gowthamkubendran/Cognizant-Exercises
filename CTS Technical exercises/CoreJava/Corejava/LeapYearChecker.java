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

public class LeapYearChecker {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a year: ");
        int n = sc.nextInt();

        if (n % 4 == 0) {
            if (n % 100 == 0) {
                if (n % 400 == 0) {
                    System.out.println(n + " is a leap year.");
                } else {
                    System.out.println(n + " is not a leap year.");
                }
            } else {
                System.out.println(n + " is a leap year.");
            }
        } else {
            System.out.println(n + " is not a leap year.");
        }
    }
}

