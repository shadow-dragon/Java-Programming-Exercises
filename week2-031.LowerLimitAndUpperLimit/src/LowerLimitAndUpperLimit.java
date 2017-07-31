
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("First: ");
        int n1 = Integer.parseInt(reader.nextLine());
        
        System.out.println("Second: ");
        int n2 = Integer.parseInt(reader.nextLine());
        
        while (n1 < ( n2 + 1 )) {
            System.out.println(n1);
            n1++;
        }

    }
}