import java.util.*;

public class LowerDemo {
    static String manualLower(String text) {
        String res = "";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') res += (char)(c + 32);
            else res += c;
        }
        return res;
    }
    static boolean compare(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String built = text.toLowerCase();
        String manual = manualLower(text);
        System.out.println("Built-in: " + built);
        System.out.println("Manual: " + manual);
        System.out.println("Equal: " + compare(built, manual));
    }
}

