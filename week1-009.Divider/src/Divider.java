
import java.util.Scanner;

public class Divider {

    public static void main(String[] args) {
        System.out.println("Enter a number "); 
        Scanner reader = new Scanner(System.in);
        int num1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Enter another number ");
        int num2 = Integer.parseInt(reader.nextLine());
        
        double quotient = 1.0 * num1 / num2; 
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }
}
