import java.util.*;
public class Array
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the array size: ");
	    int n=sc.nextInt();
	    System.out.println("Enter the array elements: ");
	    int a[]=new int[n];
	    for(int i=0;i<n;a[i++]=sc.nextInt());
	    System.out.print("The array is: ");
	    for(int i=0;i<n;i++){
	        System.out.print(a[i]+" ");
	    }
	    int sum=0;
	    int ave=0;
	    for(int i=0;i<n;i++){
	        sum=sum+a[i];
	    }
	    ave=sum/n;
	    System.out.println();
	    System.out.println("The sum of the array is: "+sum);
	    System.out.print("The average of the array is: "+ave);
	}
}