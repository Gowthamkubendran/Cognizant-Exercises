import java.util.HashMap;
public class Hashs {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Ram");
        students.put(2, "Rakshan");
        students.put(3, "kishore");
        students.put(4, "Rahul");
        students.put(5, "Surya");

        System.out.println("Student List:");
        System.out.println("ID 1: " + students.get(1));
        System.out.println("ID 2: " + students.get(2));
        System.out.println("ID 3: " + students.get(3));
        System.out.println("ID 4: " + students.get(4));
        System.out.println("ID 5: " + students.get(5));
    }
}