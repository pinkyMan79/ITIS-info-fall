import java.util.Set;

public class HashSet {
    public static void main(String[] args){
        Set set = new java.util.HashSet(1);
        set.add("Madina");
        set.add("Emiliya");
        set.add("Bulat");
        set.add("Regina");
        set.add("Lilya");
        set.add("Madina");
        System.out.println(set);
        // list - ordered collection that can contain duplicates
        // set - collection with only unique elements
    }
}
