import java.util.HashMap;
import java.util.*;

public class Part4 {
    public static void main(String[] args) {
        Map students = new HashMap();
        students.put("Madina", "Java");
        students.put("Emiliya", "Python");
        students.put("Regina", "C++");
        students.put("Lilya", "C#");
        System.out.println(students);

        String key3 = (String) "Madina";
        String value3 = (String) students.get(key3);
        System.out.println(key3 + ": " + value3);

        for (Object o : students.keySet()) {
            String key = (String) o;
            String value = (String) students.get(o);
            System.out.println(key + ": " + value);
        }
    }
}
