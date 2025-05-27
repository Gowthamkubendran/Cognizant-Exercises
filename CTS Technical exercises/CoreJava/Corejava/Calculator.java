import java.util.*;
public class Calculator
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.print("Enter a non-negative integer: ");
		int n=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++){
		    sum=sum*i;
		}
		System.out.printf("The factorial of %d is: %d",n,sum);
	}
}
