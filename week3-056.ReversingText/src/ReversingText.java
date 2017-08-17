
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        int l = text.length();
        char cha = 0; 
        String St = "";
        while (0 < l) {
            l--;
            cha = text.charAt(l);
            String s = new StringBuilder().append(cha).toString();
            St = St + s;
        }
        return St;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
