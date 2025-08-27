import java.util.*;

public class ShortestLongestWord {
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
    public static String[] shortestAndLongest(String[][] arr) {
        int minLen = Integer.parseInt(arr[0][1]);
        int maxLen = Integer.parseInt(arr[0][1]);
        String minWord = arr[0][0];
        String maxWord = arr[0][0];
        for (int i = 1; i < arr.length; i++) {
            int len = Integer.parseInt(arr[i][1]);
            if (len < minLen) {
                minLen = len;
                minWord = arr[i][0];
            }
            if (len > maxLen) {
                maxLen = len;
                maxWord = arr[i][0];
            }
        }
        return new String[]{minWord, maxWord};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[] words = customSplit(text);
        String[][] table = wordsWithLengths(words);
        String[] result = shortestAndLongest(table);
        System.out.println("Shortest: " + result[0]);
        System.out.println("Longest: " + result[1]);
    }
}
