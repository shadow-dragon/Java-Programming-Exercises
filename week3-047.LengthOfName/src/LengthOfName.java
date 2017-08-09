
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        calculateCharacters(text);
        System.out.println("Number of characters: " + calculateCharacters(text));
        
        // call your method from here
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        int calculateCharacters = text.length(); 
        return calculateCharacters;
    }
    
}
