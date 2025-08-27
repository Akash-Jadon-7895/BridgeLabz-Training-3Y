import java.util.*;

public class StringLength {
    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int custom = customLength(text);
        int builtin = text.length();
        System.out.println(custom);
        System.out.println(builtin);
    }
}
