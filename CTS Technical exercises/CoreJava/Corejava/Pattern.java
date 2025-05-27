import java.util.Scanner;
class Pattern{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a value: ");
        Object input=scanner.nextLine();

        switch(input) {
            case String s when s.matches("\\d+"):
                input=Integer.parseInt(s);
                System.out.println("The object is an Integer: " +input);
                break;
            case String s when s.matches("\\d*\\.\\d+"):
                input=Double.parseDouble(s);
                System.out.println("The object is a Double: " +input);
                break;
            case String s when s.matches("\\d*\\.\\d+f"):
                input=Float.parseFloat(s);
                System.out.println("The object is a Float: " +input);
                break;
            case String s when s.length()==1:
                input=s.charAt(0);
                System.out.println("The object is a Character: " +input);
                break;
            case String s when s.equalsIgnoreCase("true") || s.equalsIgnoreCase("false"):
                input=Boolean.parseBoolean(s);
                System.out.println("The object is a Boolean: " +input);
                break;
            case String s:
                System.out.println("The object is a String: " +s);
                break;
            default:
                System.out.println("Unknown type");
        }
    }
}