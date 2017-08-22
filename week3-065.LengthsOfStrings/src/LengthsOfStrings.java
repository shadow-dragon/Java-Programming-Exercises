
import java.util.ArrayList;

public class LengthsOfStrings {

    public static ArrayList<Integer> lengths(ArrayList<String> list) {
        ArrayList<Integer> lengthList = new ArrayList<Integer>();
        lengthList.add((list.get(0)).length());
        lengthList.add((list.get(1)).length());
        lengthList.add((list.get(2)).length());
        lengthList.add((list.get(3)).length());
        
        return lengthList;
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hallo");
        list.add("Moi");
        list.add("Benvenuto!");
        list.add("badger badger badger badger");
        ArrayList<Integer> lengths = lengths(list);

        System.out.println("The lengths of the Strings: " + lengths);
    }
}
