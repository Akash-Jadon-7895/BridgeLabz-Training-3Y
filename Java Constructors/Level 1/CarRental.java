public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    public int cost() {
        int costPerDay;
        switch (carModel) {
            case "X":
                costPerDay = 50;
                break;
            case "y":
                costPerDay = 80;
                break;
            case "Z":
                costPerDay = 100;
                break;
            default:
                costPerDay = 40;
        }
        return costPerDay * rentalDays;
    }
    public static void main(String[] args) {
        CarRental rental1 = new CarRental("a", "X", 3);
        CarRental rental2 = new CarRental("b", "Y", 2);
        CarRental rental3 = new CarRental("c", "Z", 5);
        CarRental rental4 = new CarRental("d", "A", 4);

        System.out.println("Rental 1: " + rental1.customerName + ", Car Model: " + rental1.carModel + ", Days: " + rental1.rentalDays + ", Total Cost: Rs." + rental1.cost());
        System.out.println("Rental 2: " + rental2.customerName + ", Car Model: " + rental2.carModel + ", Days: " + rental2.rentalDays + ", Total Cost: Rs." + rental2.cost());
        System.out.println("Rental 3: " + rental3.customerName + ", Car Model: " + rental3.carModel + ", Days: " + rental3.rentalDays + ", Total Cost: Rs." + rental3.cost());
        System.out.println("Rental 4: " + rental4.customerName + ", Car Model: " + rental4.carModel + ", Days: " + rental4.rentalDays + ", Total Cost: Rs." + rental4.cost());
    }
}
