import java.util.ArrayList;
import java.util.Scanner;

enum SeatClass {
    ECONOMY,
    PREMIUM_ECONOMY,
    BUSINESS,
    FIRST_CLASS
}

public class Seat {
    private String seatNumber;
    private SeatClass seatClass; 

    public Seat(String seatNumber, SeatClass seatClass) {
        this.seatNumber = seatNumber;
        this.seatClass = seatClass;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public SeatClass getSeatClass() {
        return seatClass;
    }
}

public class BookingSystem {

    public static class Booking {
        String customerName;
        String flightCode;
        String paymentMethod;
        double ticketPrice;
        Seat seat; 

        private static final ArrayList<Booking> bookings = new ArrayList<>();

        public Booking(String customerName, String flightCode, String paymentMethod, double ticketPrice, Seat seat) {
            this.customerName = customerName;
            this.flightCode = flightCode;
            this.paymentMethod = paymentMethod;
            this.ticketPrice = ticketPrice;
            this.seat = seat;
        }

        public static void addBooking(String customerName, String flightCode, String paymentMethod, double ticketPrice, Seat seat) {
            Booking newBooking = new Booking(customerName, flightCode, paymentMethod, ticketPrice, seat);
            bookings.add(newBooking);
            System.out.println("Booking successful for " + customerName + " on flight " + flightCode +
                               " with seat " + seat.getSeatNumber() + " in " + seat.getSeatClass() + " class.");
        }

        public static void displayAllBookings() {
            System.out.println("Current Bookings:");
            for (Booking booking : bookings) {
                System.out.println("Customer: " + booking.customerName);
                System.out.println("Flight Code: " + booking.flightCode);
                System.out.println("Payment Method: " + booking.paymentMethod);
                System.out.println("Ticket Price: $" + booking.ticketPrice);
                System.out.println("Seat Number: " + booking.seat.getSeatNumber());
                System.out.println("Seat Class: " + booking.seat.getSeatClass());
                System.out.println("===============================================");
            }
        }

        public static void processPayment(String paymentMethod, double amount) {
            System.out.println("Processing payment of $" + amount + " using " + paymentMethod + "...");
            System.out.println("Payment successful!");
        }
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);
        String customerName;
        String flightCode;
        String paymentMethod;
        double ticketPrice = 150.00; 
        int option;

        while (true) {
            System.out.println("Select an option: ");
            System.out.println("1: Book a flight");
            System.out.println("2: View all bookings");
            System.out.println("3: Exit");
            option = kb.nextInt();
            kb.nextLine(); 

            switch (option) {
                case 1 -> {
                    System.out.println("Enter your name: ");
                    customerName = kb.nextLine();
                    System.out.println("Enter flight code: ");
                    flightCode = kb.nextLine();
                    System.out.println("Enter payment method (e.g., Credit Card, PayPal): ");
                    paymentMethod = kb.nextLine();
                    System.out.println("Enter seat number: ");
                    String seatNumber = kb.nextLine();

                    System.out.println("Select seat class: ");
                    System.out.println("1: Economy");
                    System.out.println("2: Premium Economy");
                    System.out.println("3: Business");
                    System.out.println("4: First Class");
                    int classOption = kb.nextInt();
                    kb.nextLine(); 

                    SeatClass seatClass;
                    switch (classOption) {
                        case 1 -> seatClass = SeatClass.ECONOMY;
                        case 2 -> seatClass = SeatClass.PREMIUM_ECONOMY;
                        case 3 -> seatClass = SeatClass.BUSINESS;
                        case 4 -> seatClass = SeatClass.FIRST_CLASS;
                        default -> {
                            System.out.println("Invalid seat class selected. Defaulting to Economy.");
                            seatClass = SeatClass.ECONOMY;
                        }
                    }

                    Seat seat = new Seat(seatNumber, seatClass); 

                    Booking.addBooking(customerName, flightCode, paymentMethod, ticketPrice, seat);
                    Booking.processPayment(paymentMethod, ticketPrice);
                    break;
                }
                case 2 -> {
                    Booking.displayAllBookings();
                    break;
                }
                case 3 -> {
                    System.out.println("Thank you for using our system.");
                    System.exit(0);
                }
                default -> System.out.println("Please select a valid option.");
            }
        }
    }
}
