import java.util.HashMap;

public class StudentsFavLanguage {
    public static void main (String[] args) {
        HashMap favLanguage = new HashMap(); //initialised a hashmap

        favLanguage.put("Bald Mahmut", "C++");  // again added some characters and random language as key,valiue pairs
        favLanguage.put("Guinevera", "C");
        favLanguage.put("Inek Saban", "Java");
        favLanguage.put("Augusta", "Python");
        favLanguage.put("Zani", "C#");

        System.out.println(favLanguage.get("Zani"));  // here I get the value using get() method and print it.

        for (Object key: favLanguage.keySet()) {  // Loop trough the keys here
            System.out.println(key + ": " + favLanguage.get(key)); //then we print the key and its value using get()
        }
        

    }

}
