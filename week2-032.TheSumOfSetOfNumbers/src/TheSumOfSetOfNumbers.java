
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int num = Integer.parseInt(reader.nextLine());
        int n = 0;
        int sum = 0;
        
        while (n < (num + 1)) {
            sum = sum + n;
            n++;
        }
        
        System.out.println("Sum is " + sum);

    }
}
