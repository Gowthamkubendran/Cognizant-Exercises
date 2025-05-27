public class Example 
{
    public int square(int number)
   {
        return number * number;
    }
    public static void main(String[] args) 
    {
        Example ex = new Example();
        int result = ex.square(5);
        System.out.println("Square: " + result);
    }
}
