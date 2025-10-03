import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map PhoneBook = new HashMap();
        boolean flag = true;
        while (flag) {
            System.out.print("enter the command(add, find, all, exit): ");
            String command = scanner.next();

            switch (command) {
                case "add" -> {
                    System.out.print("enter a name: ");
                    String name = scanner.next();
                    System.out.print("enter a phone number: ");
                    String number = scanner.next();
                    PhoneBook.put(name, number);
                }
                case "find" -> {
                    System.out.print("enter a name: ");
                    String name = scanner.next();
                    if (PhoneBook.get(name) != null) {
                        System.out.println(PhoneBook.get(name));
                    }
                    else {
                        System.out.println("there are no such names");
                    }
                }
                case "all" -> {
                    if (PhoneBook.isEmpty()) {
                        System.out.println("your phonebook is empty...");
                    }
                    else {
                        for (Object o : PhoneBook.keySet()) {
                            String key = (String) o;
                            String value = (String) PhoneBook.get(o);
                            System.out.println(key + ": " + value);
                        }
                    }
                }
                case "exit" -> {
                    flag = false;
                }
                default -> System.out.println("invalid command!");
            }
        }
    }
}
