import java.util.*;

public class UnitConverter3 {
    public static double convertFarhenheitToCelsius(double farhenheit) {
        return (farhenheit - 32) * 5.0 / 9.0;
    }
    public static double convertCelsiusToFarhenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double farhenheit = sc.nextDouble();
        double celsius = sc.nextDouble();
        double pounds = sc.nextDouble();
        double kilograms = sc.nextDouble();
        double gallons = sc.nextDouble();
        double liters = sc.nextDouble();
        System.out.println(farhenheit + " F = " + convertFarhenheitToCelsius(farhenheit) + " C");
        System.out.println(celsius + " C = " + convertCelsiusToFarhenheit(celsius) + " F");
        System.out.println(pounds + " pounds = " + convertPoundsToKilograms(pounds) + " kilograms");
        System.out.println(kilograms + " kilograms = " + convertKilogramsToPounds(kilograms) + " pounds");
        System.out.println(gallons + " gallons = " + convertGallonsToLiters(gallons) + " liters");
        System.out.println(liters + " liters = " + convertLitersToGallons(liters) + " gallons");
    }
}
