import java.util.*;
public class Fibo
{
    public static int fibonacci(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
            System.out.print("Enter a positive integer: ");
	    int n=sc.nextInt();
	    System.out.print("The Fibonacci number is: "+fibonacci(n));
	}
}