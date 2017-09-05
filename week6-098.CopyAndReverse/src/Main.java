
import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
    int[] original = {1, 2, 3, 4};
    int[] reverse = reverseCopy(original);

    // print both
    System.out.println( "original: " +Arrays.toString(original));
    System.out.println( "reversed: " +Arrays.toString(reverse));
}

    public static int[] copy(int[] array) {
        int n = 0;
        int l = array.length;
        int[] copied = new int[l];
        while (n < l) {
            copied[n] = array [n];
            n++;
        }
        return copied;
    }
    
    public static int[] reverseCopy(int[] array) {
        int n = 0;
        int l = array.length;
        int[] reverseCopied = new int[l];
        while (l > 0 && n < array.length) { 
            l--;
            reverseCopied[n] = array [l];
            n++;          
        }
        return reverseCopied;
    }
    
}
