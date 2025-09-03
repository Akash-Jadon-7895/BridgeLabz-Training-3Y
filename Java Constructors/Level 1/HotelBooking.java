public class HotelBooking {
    String guestName;
    int roomType;
    int numberOfNights;
    HotelBooking(String guestName, int roomType, int numberOfNights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
    }
    HotelBooking() {
    }
    HotelBooking(HotelBooking booking) {
        this.guestName = booking.guestName;
        this.roomType = booking.roomType;
        this.numberOfNights = booking.numberOfNights;
    }
    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking("Aryan", 2, 3);
        HotelBooking booking2 = new HotelBooking(booking1);
        HotelBooking booking3 = new HotelBooking();

        System.out.println("Booking 1: " + booking1.guestName + ", Room Type: " + booking1.roomType + ", Nights: " + booking1.numberOfNights);
        System.out.println("Booking 2: " + booking2.guestName + ", Room Type: " + booking2.roomType + ", Nights: " + booking2.numberOfNights);
        System.out.println("Booking 3: " + booking3.guestName + ", Room Type: " + booking3.roomType + ", Nights: " + booking3.numberOfNights);
    }
}
