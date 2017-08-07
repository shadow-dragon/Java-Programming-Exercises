
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
         // program your solution here. Do not touch the above lines!
        System.out.println("Guess a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int t = 0;
         
            while (n != numberDrawn) {        
            if (n < numberDrawn) {
            t++;
            System.out.println("The number is greater, guess made: " + t);
          
            }
        
            else if (n > numberDrawn) { t++;
            System.out.println("The number is lesser, guess made: " + t);
           
            }
            
            else {
            System.out.println("Congratulations, your guess is correct!");
            }
            n = Integer.parseInt(reader.nextLine());

    }
            if (n == numberDrawn) {
                System.out.println("Congratulations, your guess is correct!");
            }
        }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
