import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class PasswordRandomizer {
    // Define the variables
    private Random random = new Random();
    private int length;

    public PasswordRandomizer(int length) {
        // Initialize the variable
        this.length = length;
        random = new Random();
    }

    public String createPassword() {
        // write code that returns a randomized password
        ArrayList<String> letters = new ArrayList<String>();
        Collections.addAll(letters, "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z" );
        int i = 0;
        String s = "";
        while (i < this.length) {
        String select = letters.get(random.nextInt(25));
        s = s + select;
        i++;
    }
        
        return s;
    }
}
