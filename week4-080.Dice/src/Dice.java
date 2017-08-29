import java.util.Random;

public class Dice {
    private Random random = new Random();
    private int numberOfSides;

    public Dice(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        random = new Random();
        
        // Initialize here the number of sides
    }

    public int roll() {
        // create here a random number belonging to range 1-numberOfSided
        int n = random.nextInt(numberOfSides) + 1;
        return n;
    }
}
