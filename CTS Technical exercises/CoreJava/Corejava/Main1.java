import java.util.*;
public class Main1
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter the String: ");
	    String s=sc.nextLine();
	    StringBuilder sb=new StringBuilder(s);
	    sb.reverse();
	    System.out.print("The reversed string is: "+sb.toString());
	}
}
