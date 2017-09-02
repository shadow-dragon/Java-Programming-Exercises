
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Initialization
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        //Looping for multiple continuous entries
        while (true) {
            System.out.println("name: ");
            String name = reader.nextLine();
            //Loop breaks when an empty name is given
            if (name.isEmpty()) {
                for (Student guy : list) {
                    System.out.println(guy);
                }
                break;
            } else {
                System.out.println("studentnumber: ");
                String number = reader.nextLine();
                list.add(new Student(name, number));
            }
        }

        //Searching for Student info
        System.out.println("Give search term: ");
        String search = reader.nextLine();
        System.out.println("Result: ");

        //Loop for searching
        for (Student guy : list) {
            String a = guy.getName();
            if (a.contains(search)) {
                System.out.println(guy);
            }
        }

    }
}
