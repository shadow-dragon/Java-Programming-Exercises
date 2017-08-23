
import java.util.ArrayList;

public class Variance {

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        int n = 0;
        int p = list.size();
        int sum = 0;
        while (n < p) {
            sum = sum + list.get(n);
            n++;
        }
        return sum;
    }

    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) {
        int n = sum(list);       
        int p = list.size();
        double average = 1.0 * n / p;
        return average;
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double N = list.size() - 1;
        int n = 0;
        int p = list.size();
        double x = average(list);
        double variance = 0;
        double sum = 0;

        while (n < p) {
            double diff = list.get(n) - x;
            double square = Math.pow(diff, 2);           
            sum = sum + square;
            n++;
            variance = 1.0 * sum / N;
        }
        return variance;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The variance is: " + variance(list));
    }

}
