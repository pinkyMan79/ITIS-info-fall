package team.game.entity;
import java.util.*;

public class StudentsListDemo{
    public static void main(String[] args) {
        ///QUESTIONS ANSWERING///
        // 1.Set can contain only unique elements
        //   and List can contain duplications

        // 2. Iterator is an instrument to go through some linked
        //    data structre

        // 3. Poll is a method that returns the
        //   first element of the collection and removes it

        // 4. using raw types can be dangerous because
        //

                        ///task 1. warm-up///

            //here I created empty "Students" using ArrayList datatype
//            List students = new ArrayList();
//
//            //adding elements to 'students'
//            students.add("Mirgaleeva");
//            students.add("Zaripov");
//            students.add("Akhiyarova");
//            students.add("Barkova");
//            students.add("Valeeva");



                        ///task 2///


        //creation of a new HashSet

//        Set students = new HashSet();
//        students.add("Valeeva");
//        students.add("Zaripov");
//        students.add("Valeeva");
//        students.add("Akhiyarova");
        // here i output the results. i decided to
        // remain it untouchable as
        // its appropriate for both 1st and 2nd tasks


        //outputing the ArrayList without iteration

//        System.out.println(students);
//
//        //here i remove an element (the last one) by value
//        students.remove("Valeeva");
//
//        //and outputting the result
//        System.out.println("\nAfter removal:");
//        System.out.println(students);
//
//        //time for iteration! here im using for-each loop
//        //like it was shown in a lecture
//        System.out.println("\nFor-each iteration");
//        for (Object o : students) {
//            System.out.println(o);
//        }
//
//        //now lets try to iterae by 'hasnext' and "next()" methods
//        System.out.println("\nMethods iteration:");
//        Iterator iterator = students.iterator();
//        while (iterator.hasNext()) {
//            Object one_student = iterator.next();
//            System.out.println((String) one_student);
//        }

        //While executing this block of code i noticed
        //that 'set' datatype removed duplications
        //automatically as by its origin
        // (which is different to List)
        // it can contain ONLY!!! unique elements :)


                        /// task 3///
//        Queue tasks = new LinkedList();
//        tasks.offer("Task 1");
//        tasks.offer("Task 2");
//        tasks.offer("Task 3");
//
//        for (int index = 0; index < tasks.size(); index++){
//            System.out.println("Number of elements left: " + tasks.size());
//            System.out.println(tasks.poll());
//        }

                        /// task 4///
//        Map numbers = new HashMap();
//        numbers.put("Lilya", "Java");
//        numbers.put("Ivan", "C++");
//        numbers.put("Olesya", "C#");
//        numbers.put("Alex", "Python");
//        System.out.println(numbers.get("Lilya"));
//
//        for (Object key: numbers.keySet()){
//            System.out.println(key + ": " + numbers.get(key));
//        }








    }
}

