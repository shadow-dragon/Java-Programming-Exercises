
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> list = new ArrayList<Person>();

    public void add(String name, String number) {
        this.list.add(new Person(name, number));
    }

    public void printAll() {
        for (Person person : list) {
            System.out.println(person.getName() + " number: " + person.getNumber());
        }
    }

    public String searchNumber(String name) {
        System.out.println("Give search term: ");
        String search = name;
        System.out.println("Result: ");
        //Loop for searching
        for (Person guy : list) {
            String a = guy.getName();
            if (a.contains(search)) {
                return guy.getNumber();
            }
        }
        return "number not known";
    }

}
