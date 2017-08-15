
import java.util.Scanner;

public class FirstPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String text = reader.nextLine();
        System.out.println("Length of the first part: ");
        int n = Integer.parseInt(reader.nextLine());
        calculateCharacters(text);
        firstPart(n, text);
        
    }
    
        public static int calculateCharacters(String text) {
        int calculateCharacters = text.length(); 
        return calculateCharacters;
    }
        
        public static void firstPart(int n, String text) {
            System.out.println("Result: " + text.substring(0,n));
            
        }
        
    
}
