import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class StudentListDemo{
    public static void main(String[] args) {

        ArrayList studentList = new ArrayList(); //okay so I here initialise an array

        studentList.add("Guinevera"); // Here I add some characters from stuff I watch, some of them are Turkish names
        studentList.add("Mahmut Efendi");
        studentList.add("Kapici Veysel");
        studentList.add("Inek Saban");
        studentList.add("Bald Mahmut");

        System.out.println(studentList); //Here I print the list to console

        studentList.remove("Mahmut Efendi"); //I decided to remove Mahmut Efendi,

        System.out.println(studentList); // Here I checked if its properly removed

        System.out.println(studentList.size()); // I used size() method to check the lenght of list
        System.out.println(studentList.isEmpty()); // checked if its empty

        for (Object name: studentList){  //here at first I forget it was a generic list and used String name:
            // fixed afterwards, loops trough names in list
            System.out.println(name);
        }

        Iterator iterator = studentList.iterator();

        while (iterator.hasNext()) {         // made a loop that runs as long as we have elements

            Object name = iterator.next();  // we get the current element and move forward
            System.out.println(name); // and we print the current element
        }

        //2nd Tasks


        HashSet studentSet = new HashSet();

        studentSet.add("Guinevera");
        studentSet.add("Guinevera"); 
        studentSet.add("Mahmut Efendi");
        studentSet.add("Kapici Veysel");
        studentSet.add("Inek Saban");
        studentSet.add("Bald Mahmut");

        System.out.println(studentList);

        // Answer for: "How does `Set` differ from `List`?"
        //Compared to lists, Sets dont store duplicates. 
        //And in sets the values are not ordered, while in lists values are ordered

        // Answer for "What does an `Iterator` do?":
        // it loops through elements one by one with methods like hasnext() and next(),

        // answer for "Why can using raw types be dangerous?":
        // when we dont use generic types the computer stops checking if we put the correct thing inside, it can cause crashes or errors.
        // so its better to declare what we are going to keep in our list/map etc.

    }
}
