
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        int div1 = year % 100;
        int div2 = year % 4;
        int div3 = year % 400;
       
        if (div1 == 0 && div2 == 0 && div3 == 0 ) {
            System.out.println("The year is a leap year.");           
        }
        
        else if (div1 != 0 && div2 == 0) {
            System.out.println("The year is a leap year.");
        }
        
        else if (div1 == 0 && div2 != 0 && div3 == 0) {
            System.out.println("The year is not a leap year.");
        }
        
        else if (div1 != 0 && div2 != 0) {
            System.out.println("The year is not a leap year.");
        }
        
        else {
            System.out.println("The year is not a leap year.");
        }
    }
}
