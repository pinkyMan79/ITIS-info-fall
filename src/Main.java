//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        StudentListDemo myStudentListDemo = new StudentListDemo(); //creating instance of class
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        myStudentListDemo.adding(); //implement methods
        myStudentListDemo.size();
        for (Object name : myStudentListDemo) { // loop for iterating in array
            System.out.println(name);
        }
        Queue_map que = new Queue_map();
        que.addingremoving();
        que.keyvalue();
    }
}