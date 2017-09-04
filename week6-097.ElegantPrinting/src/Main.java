
public class Main {

    public static void main(String[] args) {
        // test method here
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }

    public static void printElegantly(int[] array) {
        // Write code here
        int n = 0;
        while (n < array.length) {
            if (n == 0) {
                System.out.print(array[n]);
            } else {
                System.out.print(", " + array[n]);
            }
            n++;
        }
    }
}
