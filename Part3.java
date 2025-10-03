import java.util.LinkedList;
import java.util.Queue;

public class Part3 {
    public static void main(String[] args) {
        Queue queue = new LinkedList();
        queue.offer("Task 1"); //adding task name
        queue.offer("Task 2");
        queue.offer("Task 3");
        System.out.println(queue.size()); //printing the number of elements
        System.out.println(queue.poll()); //removing element
        System.out.println(queue.size());
        System.out.println(queue.poll()); //poll can remove element from queue
        System.out.println(queue.size());
        System.out.println(queue.poll());
        System.out.println(queue.size());
    }
}
