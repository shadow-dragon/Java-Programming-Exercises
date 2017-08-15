
import java.util.Scanner;

public class TheEndPart {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a word: ");
        String word = reader.nextLine();
        length(word);
        System.out.println("Length of the end part: ");
        int n = Integer.parseInt(reader.nextLine());
        int m = length(word);
        int p = m - n;
        endPart(p, word);

    }

    public static int length(String text) {
        int length = text.length();
        return length;
    }

    public static void endPart(int p, String word) {
        System.out.println("Result: " + word.substring(p));

    }
}
