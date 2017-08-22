
import java.util.ArrayList;

public class AverageOfNumbers {

    // Copy here the method sum from previous assignment
    public static int sum(ArrayList<Integer> list) {
        int n = 0;
        int p = list.size();
        int sum = 0;
        while (n < p){
            sum = sum + list.get(n);
            n++;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        int n = sum(list);
        System.out.println(n);
        int p = list.size();
        System.out.println(p);
        double average = 1.0 * n/p;  
        return average;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);

        System.out.println("The average is: " + average(list));
    }
}