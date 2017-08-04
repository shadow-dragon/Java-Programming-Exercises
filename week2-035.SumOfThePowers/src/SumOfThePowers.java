
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int n1 = Integer.parseInt(reader.nextLine());
        int n2 = 0;
        int sum = 0;
        
        while (n2 < (n1 + 1)) {
            sum = sum + (int)Math.pow(2, n2);
            n2++;   
        }
        System.out.println("The result is " + sum);
    }
}
