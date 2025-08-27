import java.util.*;

public class TrimSpaces {
    public static int[] findTrimPoints(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') {
            start++;
        }
        while (end >= 0 && s.charAt(end) == ' ') {
            end--;
        }
        return new int[]{start, end + 1};
    }
    public static String customSubstring(String s, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += s.charAt(i);
        }
        return result;
    }
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        int[] points = findTrimPoints(text);
        String custom = customSubstring(text, points[0], points[1]);
        String builtin = text.trim();
        boolean result = compareStrings(custom, builtin);
        System.out.println(result);
    }
}
