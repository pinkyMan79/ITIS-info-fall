import java.util.*;

public class StudentListDemo implements Iterable {
    List list = new ArrayList();
    Set set = new HashSet();
    public void adding(){
        list.add("masha");
        list.add("ivan");
        list.add("sasha");
        list.add("dima");
        list.add("anna");
        System.out.println(list); //see all names
        list.remove("sasha");
        System.out.println(list); //will see list without sasha
        set.add("masha");
        set.add("ivan");
        set.add("sasha");
        set.add("anna");
        set.add("anna");
        System.out.println(set); //see all names but without repetitions only unique elements
        set.remove("ivan");
        System.out.println(set); // in set we have unique only values even if we try to put same twice
    }
    public void size() {
        System.out.println(list.size()); // size of this list
        System.out.println(list.isEmpty()); // boolean False if list is not empty
        System.out.println(set.size());
        System.out.println(set.isEmpty());
    }
    @Override
    public Iterator iterator() {
        return new Iterator() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < list.size(); //length
            }
            @Override
            public Object next() {
                return list.get(index++); //next value by index+1
            }
        };
    }

}