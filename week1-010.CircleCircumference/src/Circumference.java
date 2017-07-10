
import java.util.Scanner;

public class Circumference {
    public static void main(String[] args) {
        System.out.println("Type the radius: "); 
        Scanner reader = new Scanner(System.in);
        int radius;
        radius = Integer.parseInt(reader.nextLine());
        double Circumference = 2 * Math.PI * radius;
        System.out.print("Circumference of the circle: " + Circumference);
    }
}
