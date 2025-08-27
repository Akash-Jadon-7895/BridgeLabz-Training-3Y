import java.util.*;

public class WordLength2D {
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
    public static String[][] wordsWithLengths(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(customLength(words[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] result = wordsWithLengths(words);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + "\t" + Integer.parseInt(result[i][1]));
        }
    }
}
