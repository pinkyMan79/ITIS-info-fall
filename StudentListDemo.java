import java.util.ArrayList;
import java.util.Iterator;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        //created list of students, added names into it
        ArrayList students = new ArrayList();

        students.add("Dima");
        students.add("Vanya");
        students.add("Dasha");
        students.add("Ann");
        students.add("Masha");
        

        // showed the list of students, deleted one of them, used two approaches of printing name by name
        System.out.println("list of sutdent: " + students);

        
        students.remove("Dima");
        System.out.println("Removed by value: " + students);

        System.out.println("Size of array: " + students.size());
        System.out.println("Show if empty: " + students.isEmpty());

        System.out.println("for-each");
        for (Object student : students) {
            System.out.println("Student - " + student);
        }

        System.out.println("Iterator");
        //iterator gives as ability to go through list elemnt by elemnt. Creates a start of the list, then by using next() moves forward
        Iterator Iter = students.iterator();
        while (Iter.hasNext()) {
            Object student = Iter.next();
            System.out.println("Student - " + student);
        }

        System.out.println("TASK 2");

        // created hashset for students, the difference is that hashset doesn't remember and use the direct order of elements. It always deletes the duplicates
        HashSet studentSet = new HashSet();
        studentSet.add("Masha");
        studentSet.add("Dima");
        studentSet.add("Vanya");
        studentSet.add("Dasha");
        studentSet.add("Ann");
        studentSet.add("Masha");

        System.out.println("HashSet: " + studentSet);
        System.out.println("HashSet size: " + studentSet.size());

        System.out.println("TASK 3");
        //created the list of tasks, used Queue to be able to use .poll() to delete the first element each time
        Queue tasks = new LinkedList();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");

        while (!tasks.isEmpty()){
            System.out.println("Size of a Queue: " + tasks.size());
            Object task = tasks.poll();
        }
        
        //using raw-type may not let you use all functionallity, hard to read and maintain  
    }
}