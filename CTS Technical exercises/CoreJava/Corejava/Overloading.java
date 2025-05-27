import java.util.*;
public class Overloading
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    Calculator calc=new Calculator();
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    System.out.printf("Addition of %d and %d is: %d\n",a,b,calc.add(a,b));
	    double c=sc.nextDouble();
	    double d=sc.nextDouble();
	    System.out.printf("Addition of %.2f and %.2f is: %.2f\n",c,d,calc.add(c,d));
	    int e=sc.nextInt();
	    int f=sc.nextInt();
	    int g=sc.nextInt();
	    System.out.printf("Addition of %d and %d and %d is: %d\n",e,f,g,calc.add(e,f,g));
	}
}
class Calculator{
    int add(int a,int b){
        return a+b;
    }
    double add(double c,double d){
        return c+d;
    }
    int add(int e,int f,int g){
        return e+f+g;
    }
}