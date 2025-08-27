import java.util.*;

public class UniqueCharacters {
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

    public static char[] findUnique(String s) {
        int n = customLength(s);
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
                temp[uniqueCount] = c;
                uniqueCount++;
            }
        }
        char[] result = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        char[] unique = findUnique(text);
        for (char c : unique) {
            System.out.print(c + " ");
        }
    }
}
