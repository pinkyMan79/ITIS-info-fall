import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    private Map<String, String> contacts;
    private Scanner scanner;

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook(); //creating instance and starting program
        phoneBook.starting();
    }
    public PhoneBook() {
        contacts = new HashMap<>(); // create a hashmap for contacts
        scanner = new Scanner(System.in); //input command
    }

    public void starting() {
        while (true) {
            System.out.print("enter command: ");
            String command = scanner.nextLine().toLowerCase();
            switch (command) {
                case "add":
                    addContact();
                    break;
                case "find":
                    findContact();
                    break;
                case "all":
                    showAllContacts();
                    break;
                case "exit":
                    System.out.println("goodbye");
                    return;
            }
        }
    }

    private void addContact() {
        System.out.print("enter name: ");
        String name = scanner.nextLine(); //loading name-phone pairs
        System.out.print("enter phone number: ");
        String phoneNumber = scanner.nextLine();
        if (contacts.containsKey(name)) {
            System.out.println("contact " + name + " already exists. update number.");
        } else {
            System.out.println("contact " + name + " added successfully.");
        }
        contacts.put(name, phoneNumber);
    }

    private void findContact() {
        System.out.print("enter name to find: ");
        String name = scanner.nextLine();
        String phoneNumber = contacts.get(name); //getting phone number by name
        if (phoneNumber != null) {
            System.out.println("phone number for " + name + ": " + phoneNumber);
        } else {
            System.out.println("contact " + name + " not found.");
        }
    }

    private void showAllContacts() {
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue()); //printing all pairs key+value
        }
    }

}