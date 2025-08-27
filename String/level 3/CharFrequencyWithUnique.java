import java.util.*;

public class CharFrequencyWithUnique {
    public static char[] uniqueCharacters(String s) {
        int n = s.length();
        char[] temp = new char[n];
        int uniqueCount = 0;
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (s.charAt(j) == c) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                temp[uniqueCount++] = c;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static String[][] findFrequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i)]++;
        }
        char[] unique = uniqueCharacters(s);
        String[][] result = new String[unique.length][2];
        for (int i = 0; i < unique.length; i++) {
            result[i][0] = String.valueOf(unique[i]);
            result[i][1] = String.valueOf(freq[unique[i]]);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        String[][] freqArray = findFrequency(text);
        System.out.println("Char\tFrequency");
        for (int i = 0; i < freqArray.length; i++) {
            System.out.println(freqArray[i][0] + "\t" + freqArray[i][1]);
        }
    }
}
