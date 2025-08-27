import java.util.*;

public class SplitCompare {
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
    public static String[] customSplit(String s) {
        int len = customLength(s);
        int spaces = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') spaces++;
        }
        int[] spaceIndex = new int[spaces + 2];
        spaceIndex[0] = -1;
        int idx = 1;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == ' ') {
                spaceIndex[idx++] = i;
            }
        }
        spaceIndex[idx] = len;
        String[] words = new String[spaces + 1];
        for (int i = 0; i < words.length; i++) {
            String temp = "";
            for (int j = spaceIndex[i] + 1; j < spaceIndex[i + 1]; j++) {
                temp += s.charAt(j);
            }
            words[i] = temp;
        }
        return words;
    }
    public static boolean compareArrays(String[] a1, String[] a2) {
        if (a1.length != a2.length) return false;
        for (int i = 0; i < a1.length; i++) {
            if (!a1[i].equals(a2[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] custom = customSplit(text);
        String[] builtin = text.split(" ");
        boolean result = compareArrays(custom, builtin);
        System.out.println(result);
    }
}
