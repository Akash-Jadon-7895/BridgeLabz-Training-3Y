import java.util.Scanner;

class TempConversion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double celcius=sc.nextInt();
        double fahrenheit= (celcius*9/5)+32;
        System.out.println(fahrenheit);
    
    }
}
