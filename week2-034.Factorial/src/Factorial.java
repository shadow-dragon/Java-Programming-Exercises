import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int n = 1;
        int product = 1;
        
        while (n < (num + 1)) {
            product = product * n;
            n++;
        }
        System.out.println("Factorial is " + product);
    }
}
