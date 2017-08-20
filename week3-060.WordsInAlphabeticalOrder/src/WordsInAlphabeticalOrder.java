
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInAlphabeticalOrder {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();

        while (true) {
            System.out.print("Type a word: ");
            String word = reader.nextLine();

            if (word.isEmpty()) {
                System.out.println("You typed the following words:");
                Collections.sort(words);
                for (String wor : words) {
                    System.out.println(wor);
                }
                break;

            } else {
                words.add(word);
            }
        }
    }
}
