import java.io.PrintStream;
import java.text.ChoiceFormat;
import java.util.HashMap;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class PhoneBook {
    public static void main(String[] args) {
        HashMap book =  new HashMap();  // created the hashset we will keep the names and phone numbers

        Scanner scanner = new Scanner(System.in); // created the area user will input their choices

        System.out.println("==Hello this is a phonebook==\n");

        while (true) {  

            System.out.println("What do you want to do?\n"); // created a menu for users

            System.out.println("1. Add a new contact\n");
            System.out.println("2. Find a contact by name \n");
            System.out.println("3. Look at all your entries\n");
            System.out.println("4. Exit\n");

            String choice = scanner.nextLine(); // made a variable for the input area

            if (choice.equals("1")) {   // here if user picks first, they enter the name of the person, then the phone number
                System.out.println("Enter the name please");
                String name =  scanner.nextLine();
                System.out.println("Enter the phone number of " + name);
                String phonenum = scanner.nextLine();
                book.put(name, phonenum); // then after taking the inputs we add it to our hashmap
                System.out.println(name + " Has been added :>");
            } else if  (choice.equals("2")) {

                System.out.println("Who's number are you looking for? "); //well here we ask who the user is looking for
                String name = scanner.nextLine();  // here system takes the name 
                System.out.println(name + ":" + book.get(name)); // then teh system prints the phone number and their name

            } else if (choice.equals("3")) {

                if (book.isEmpty()) {  //if the book is empty, we receive a message
                    System.out.println("Sorry, you dont have anyone in your list :<.");
                } else {
                    for (Object key: book.keySet()){
                        System.out.println(key + " : " + book.get(key));
                    }
                }

            } else if (choice.equals("4")) { // system exists
                System.out.println("Exiting the book . . . ");
                break;
            } else { //if user puts anything other than 1-4 it prints this
                System.out.println("No such option :<");
            }
        }
    }
}
