import java.util.Queue;
import java.util.LinkedList;
import java.util.PrimitiveIterator;

public class TasksList {
    public static void main(String[] args) {

        Queue tasks = new LinkedList();

        tasks.add("Task1");  //Added random tasks
        tasks.add("Task2");
        tasks.add("Task3");
        tasks.add("Task4");
        tasks.add("Task5");
        tasks.add("Task6");
        tasks.add("Task7");
        tasks.add("Task8");

        
        while (!tasks.isEmpty()){ //here I created a while loop that will run until the queue is empty
            System.out.println(tasks.size()); // printed the number of elements before each deletion happened
            Object task = tasks.poll(); // here I used poll() to remove the elemnts 
            System.out.println(task); // and print each element before deletion
        }

        System.out.println(tasks); // checked if its empty
    }
}
