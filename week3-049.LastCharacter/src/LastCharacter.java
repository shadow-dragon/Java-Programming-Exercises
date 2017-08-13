import java.util.Scanner;


public class LastCharacter {
 public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String text = reader.nextLine();
        calculateCharacters(text);
        lastCharacter(text);
        System.out.println("Last character: " + lastCharacter(text));
        // call your method from here
    }
    
    // do here the method
    public static int calculateCharacters(String text) {
        int calculateCharacters = text.length(); 
        return calculateCharacters;
    }
    
     public static char lastCharacter(String text) {
        char lastCharacter = text.charAt(calculateCharacters(text) - 1);
        return lastCharacter;
    }
}
