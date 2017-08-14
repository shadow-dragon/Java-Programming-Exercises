
import java.util.Scanner;

public class SeparatingCharacters {

     public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        calculateCharacters(text);
        int n = 0;

       
            while (n < calculateCharacters(text)) {
                char cha = text.charAt(n);
                
                System.out.println((n + 1) + ". character: " + cha);
                n++;
            }

        
    }

    public static int calculateCharacters(String text) {
        int calculateCharacters = text.length();
        return calculateCharacters;
    }

}

