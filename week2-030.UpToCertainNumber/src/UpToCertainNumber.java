
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Up to what number? ");
        int n = Integer.parseInt(reader.nextLine());
        int m = 1;
        
        while (m < ( n + 1 )) {
            System.out.println(m);
            m++;
        }
    }
}
