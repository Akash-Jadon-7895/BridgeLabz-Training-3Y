import java.util.Scanner;

public class Cmpstr { 
    static boolean cmp(String s1, String s2) {
        if (s1.length()!=s2.length()) return false;
        for (int i=0;i<s1.length();i++) if (s1.charAt(i)!=s2.charAt(i)) return false;
        return true;
    }
    public static void main(String[] a) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next(),s2=sc.next();
        boolean r1=cmp(s1,s2),r2=s1.equals(s2);
        System.out.println("charAt(): "+r1);
        System.out.println("equals(): "+r2);
        System.out.println(r1==r2?"Same result":"Different result");
    }
    
}
