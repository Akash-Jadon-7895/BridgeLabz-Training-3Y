import java.util.*;

public class PalindromeCheck {
    public static boolean isPalindromeIterative(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return isPalindromeRecursive(s, start + 1, end - 1);
    }

    public static char[] reverseString(String s) {
        int n = s.length();
        char[] rev = new char[n];
        for (int i = 0; i < n; i++) {
            rev[i] = s.charAt(n - 1 - i);
        }
        return rev;
    }

    public static boolean isPalindromeArray(String s) {
        char[] original = s.toCharArray();
        char[] reversed = reverseString(s);
        if (original.length != reversed.length) return false;
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println("Iterative check: " + isPalindromeIterative(text));
        System.out.println("Recursive check: " + isPalindromeRecursive(text, 0, text.length() - 1));
        System.out.println("Array check: " + isPalindromeArray(text));
    }
}
