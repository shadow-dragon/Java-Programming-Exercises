
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {
        // Declaring the scanner
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("Enter temperature: ");
            double temp = Double.parseDouble(reader.nextLine());
            if (temp >= -30 && temp <= 40) {
                Graph.addNumber(temp);  
            }    
        }
    }
}