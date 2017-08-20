
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();
            
            if (word.isEmpty()) {
                System.out.println("You typed the following words:");
                int n = words.size();
                
                while (n > 0) {
                    n--;
                    System.out.println(words.get(n));
                }
                
                
                break;
            } else {
                words.add(word);
            }
        }
    }
}
