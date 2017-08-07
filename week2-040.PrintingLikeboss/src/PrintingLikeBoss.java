public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        int n = 0;
        while (n < amount) {
            System.out.print("*");
            n++;
        }
        System.out.print("\n");
    }

    public static void printWhitespaces(int amount) {
        int m = 0;
        while (m < amount) {
            System.out.print(" ");
            m++;
        }
    }

    public static void printTriangle(int size) {
        int o = 1;
        while (o < (size + 1)) {
            printWhitespaces(size - o);
            printStars(o);
            o++;
            
        }   
    }

    public static void xmasTree(int height) {
       int h = 1;
       while ( h < ( height + 1 )) {
           printWhitespaces( height - h );
            printStars(( 2 * h ) - 1 );
            h++;
       }
       printWhitespaces(height - 2 );
       printStars(3);
       printWhitespaces(height - 2 );
       printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
