
import java.util.ArrayList;
import java.util.Collections;

public class RemoveLast {
    
    public static void removeLast(ArrayList<String> list) {
    list.remove(list.size() - 1);
    System.out.println(list); 
}

    public static void main(String[] args) {
        // Here an example what you can do with the method 
        ArrayList<String> persons = new ArrayList<String>();
        persons.add("Pekka");
        persons.add("James");
        persons.add("Liz");
        persons.add("Brian");

        System.out.println("Persons:");
        System.out.println(persons);
       
        Collections.sort(persons);
       
        removeLast(persons);

        
    }
    
    
}