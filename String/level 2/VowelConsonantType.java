import java.util.*;

public class VowelConsonantType {
    public static String checkCharType(char c) {
        if (c >= 'A' && c <= 'Z') {
            c = (char)(c + 32);
        }
        if (c >= 'a' && c <= 'z') {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        }
        return "Not a Letter";
    }
    public static String[][] classifyCharacters(String s) {
        String[][] result = new String[s.length()][2];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            result[i][0] = String.valueOf(c);
            result[i][1] = checkCharType(c);
        }
        return result;
    }
    public static void display2DArray(String[][] arr) {
        System.out.println("Character\tType");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][0] + "\t\t" + arr[i][1]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        String[][] classified = classifyCharacters(text);
        display2DArray(classified);
    }
}
