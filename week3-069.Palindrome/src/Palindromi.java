import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        int l = text.length();
        char cha = 0; 
        String St = "";
        while (0 < l) {
            l--;
            cha = text.charAt(l);
            String s = new StringBuilder().append(cha).toString();
            St = St + s;            
        }
        
        if (St.equals(text)) {
            return true;
        } else {
        return false;
        }
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
    
    
}
