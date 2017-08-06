
import java.util.Scanner;

public class ManyPrints { 
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) {
        // use the while structure to call the printText method several times
        Scanner reader = new Scanner(System.in);
        System.out.println("How many?");
        int n = Integer.parseInt(reader.nextLine());
        int i = 1;
        
        while (i < (n+1)) {
            printText();
            i++;
        }
     
    }
}