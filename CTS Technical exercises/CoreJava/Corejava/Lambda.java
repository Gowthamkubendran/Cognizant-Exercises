import java.util.*;
public class Lambda{
    public static void main(String[] args){
        List<String> names=Arrays.asList("Charlie","Alice","Bob","David");
        Collections.sort(names,(s1,s2)->s1.compareTo(s2));
        System.out.println("Sorted List:");
        for (String name:names) {
            System.out.println(name);
        }
    }
}