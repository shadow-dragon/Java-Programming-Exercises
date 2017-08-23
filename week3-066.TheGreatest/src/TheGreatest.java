import java.util.ArrayList;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        int n1 = list.get(0);
        int n2 = list.get(1);
        int n3 = list.get(2);
        int n4 = list.get(3);
        int n;
        n = Math.max(Math.max(n1, n2), Math.max(n3, n4));
        return n;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}