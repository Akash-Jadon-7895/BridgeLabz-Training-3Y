import java.util.Scanner;

public class Substrcmp {
    static String subByCharAt(String s, int st, int en) {
        String r="";
        for(int i=st;i<en;i++) r+=s.charAt(i);
        return r;
    }
    static boolean cmp(String a, String b) {
        if(a.length()!=b.length()) return false;
        for(int i=0;i<a.length();i++) if(a.charAt(i)!=b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int st=sc.nextInt(),en=sc.nextInt();
        String s1=subByCharAt(s,st,en);
        String s2=s.substring(st,en);
        boolean same=cmp(s1,s2);
        System.out.println("Substring by charAt(): "+s1);
        System.out.println("Substring by substring(): "+s2);
        System.out.println("Comparison: "+same);
    }
    
}
