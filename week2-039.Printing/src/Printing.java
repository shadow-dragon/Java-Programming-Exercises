
public class Printing {

    public static void printStars(int amount) {
        int n = 0;
        while (n < amount) {
            System.out.print("*");
            n++;
        }
        System.out.print("\n");

        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times  
    }

    public static void printSquare(int sideSize) {
       int a = 0;
       while (a < sideSize) {
           printStars(sideSize);
           a++;
       }
       System.out.print("\n");
        }

    public static void printRectangle(int width, int height) {
        int h = 0;
       while (h < height) {
           printStars(width);
           h++;
       }
       System.out.print("\n");
        }
    

    public static void printTriangle(int size) {
        int s = 1;
        while (s < ( size + 1)) {
            printStars(s);
            s++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

        printStars(5);
        printStars(3);
        printStars(9);
        System.out.println("\n---");
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

}
