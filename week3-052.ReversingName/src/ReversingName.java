
import java.util.Scanner;

public class ReversingName {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a text: ");
        String text = reader.nextLine();
        reverse(text);
        
    }

    public static void reverse(String text) {
        int reverse = text.length();
        int n = reverse;  
        while (0 < n) {
            n = n - 1;
            char cha = text.charAt(n);
            System.out.print(cha);          
        }
        
    }

}
