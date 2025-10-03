import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentListDemo {
    public static void main(String[] args){
        List list = new ArrayList(1);
        list.add("Madina");
        list.add("Emiliya");
        list.add("Bulat");
        list.add("Regina");
        list.add("Lilya");
        System.out.println(list);
        list.remove(2);
        System.out.println(list.isEmpty());
        System.out.println(list.size());

        for (Object o: list) {
            System.out.println(o);
        }

        Iterator iterator = list.iterator();     //iterator can be used to loop through collections
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }  //if we use raw types, it can prevent the compiler from type-checking 
    }
}
