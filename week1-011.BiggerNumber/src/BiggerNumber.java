
import java.util.Scanner;

public class BiggerNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());
        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());
        int greaterNum;
        greaterNum = Math.max(num1, num2);
        System.out.print("The bigger number of the two numbers given was: " + greaterNum);
        
    }
}