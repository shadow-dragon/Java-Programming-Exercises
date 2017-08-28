
import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private ArrayList<Integer> NumberStatistics = new ArrayList<Integer>();

    public NumberStatistics() {
        // initialize here the object variable amountOfNumbers       
        this.amountOfNumbers = amountOfNumbers;
    }

    public void addNumber(int number) {
        this.amountOfNumbers = number;
        NumberStatistics.add(amountOfNumbers);

    }

    public int amountOfNumbers() {
        // code here        
        int size = NumberStatistics.size();
        return size;
    }

    public int sum() {
        // code here
        int sum = 0;
        for (int number : NumberStatistics) {
            sum = sum + number;
        }
        return sum;
    }

    public double average() {
        // code here
        int sum = sum();
        int size = amountOfNumbers();

        if (size == 0) {
            double average = 0;
            return average;
        } else {
            double average = 1.0 * sum / size;
            return average;
        }
    }

}
