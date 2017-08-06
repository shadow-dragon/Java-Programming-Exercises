
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type numbers: ");
        int num;
        int sum = 0;
        int times = 0;
        int odd = 0;
        int even = 0;

        while (true) {
            num = Integer.parseInt(reader.nextLine());

            if (num == -1) {
                System.out.println("Thank you and see you later!");
                break;
            }
            else {
                sum = sum + num;
                times++;
                int rem = num % 2;
                
                if (rem == 0) {
                    even++;
                }
                
                else {
                    odd++;
                }
            }
        }
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + times);
        double average = 1.0 * sum / times;
        System.out.println("Average: " + average);
        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);
    }
}
