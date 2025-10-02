import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Queue_map {
    Queue tasks = new LinkedList();
    public void addingremoving(){
        tasks.add("task 1");
        tasks.add("task 2"); // adding tasks to que
        tasks.add("task 3");
        System.out.println(tasks);
        tasks.poll(); // take elem from queue
        System.out.println(tasks);
        System.out.println(tasks.size()); //print the size of queue
        tasks.poll();
        System.out.println(tasks);
        System.out.println(tasks.size());
        tasks.poll();
        System.out.println(tasks);
        System.out.println(tasks.size());

    }
    HashMap<String, String> lang = new HashMap<>(); //i used generics because without strict declaration
    public void keyvalue(){                   // type error was raised
        lang.put("masha", "python");
        lang.put("ivan", "c++"); //adding to the hashmap
        lang.put("sasha", "c#");
        lang.put("dima", "java");
        System.out.println(lang);
        String proglang = lang.get("dima"); //getting value by key
        System.out.println(proglang);
        for (Object student: lang.keySet()){ // go through keys
            String prog = lang.get(student);
            System.out.println(student + " = " + prog); // print all pairs key-value


        }



    }
}
