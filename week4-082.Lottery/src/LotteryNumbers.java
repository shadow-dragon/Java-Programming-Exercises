
import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
        this.random = random;
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // Write the number drawing here using the method containsNumber()
        numbers.clear();
        
        int i = 0;
        int n = 0;
        while (i < 7) {
            n = random.nextInt(39) + 1;
            if (numbers.contains(n)) {
                
            } else {
                numbers.add(n);
                i++;
            }
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already among the drawn numbers
        if (numbers.contains(number)) {
           return true; 
        }
        return false;
    }
}
    