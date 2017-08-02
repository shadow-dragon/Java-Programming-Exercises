
import java.util.Scanner;


public class TheSumBetweenTwoNumbers {
   public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("First:  ");
        int n1 = Integer.parseInt(reader.nextLine());
        System.out.println("Last: ");
        int n2 = Integer.parseInt(reader.nextLine());
        int sum = 0;
        
        while (n1 < (n2 + 1)) {
            sum = sum + n1;
            n1++;
        }
        
        System.out.println("Sum is " + sum);

    }
}