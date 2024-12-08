import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.*;
import java.util.regex.Pattern;

// Enum for different seat classes in the booking system
enum SeatClass {
    ECONOMY,
    PREMIUM_ECONOMY,
    BUSINESS,
    FIRST_CLASS
}



// Enum for different seat classes in the booking system
public class BookingSystem {

    // Inner class representing a booking
    public static class Booking {
        String customerName;
        String flightCode;
        String paymentMethod;
        double ticketPrice;
        String seatNumber;
        SeatClass seatClass;

        // Static list to store all bookings
        private static final ArrayList<Booking> bookings = new ArrayList<>();

        // Constructor for creating a new Booking instance
        public Booking(String customerName, String flightCode, String paymentMethod, double ticketPrice, String seatNumber, SeatClass seatClass) {
            this.customerName = customerName;
            this.flightCode = flightCode;
            this.paymentMethod = paymentMethod;
            this.ticketPrice = ticketPrice;
            this.seatNumber = seatNumber;
            this.seatClass = seatClass;
        }

        // Static method to add a new booking, checking for duplicate seats
        public static void addBooking(String customerName, String flightCode, String paymentMethod, double ticketPrice, String seatNumber, SeatClass seatClass) {
            // Improvement: Consider checking if flightCode is valid or exists in a predefined list of flights.
            // Improvement: Validate customerName and paymentMethod to ensure they are not empty or null.
            // Validate customerName
            if (customerName == null || customerName.trim().isEmpty()) {
                System.out.println("Customer name cannot be empty.");
                return;
            }

            // Validate paymentMethod
            // Improvement: Add validation to check if paymentMethod is valid or supported (e.g., Credit Card, PayPal, etc.).

            List<String> validPaymentMethods = Arrays.asList("Credit Card", "PayPal", "Bank Transfer");
            if (!validPaymentMethods.contains(paymentMethod)) {
                System.out.println("Invalid payment method. Please choose from: Credit Card, PayPal, Bank Transfer.");
                return;
            }

            // Validate flightCode format (uppercase alphanumeric)
            if (!Pattern.matches("[A-Z0-9]+", flightCode)) {
                System.out.println("Invalid flight code format. It should be uppercase and alphanumeric.");
                return;
            }
            // Improvement: Add validation to ensure ticketPrice is a positive value.

            // Validate ticketPrice
            if (ticketPrice <= 0) {
                System.out.println("Ticket price must be a positive value.");
                return;
            }

            // Check if seat is already booked for the flight
            for (Booking booking : bookings) {
                if (booking.flightCode.equals(flightCode) && booking.seatNumber.equals(seatNumber)) {
                    System.out.println("This seat is already booked.");
                    return;
                }
            }

            // Create a new booking and add it to the list
            Booking newBooking = new Booking(customerName, flightCode, paymentMethod, ticketPrice, seatNumber, seatClass);
            bookings.add(newBooking);
            System.out.println("Booking successful for " + customerName + " on flight " + flightCode +
                    " with seat " + seatNumber + " in " + seatClass + " class.");
        }

        // Static method to display all current bookings
        public static void displayAllBookings() {
            if (bookings.isEmpty()) {
                System.out.println("No bookings available.");
                return;
            }

            System.out.println("Current Bookings:");
            for (Booking booking : bookings) {
                System.out.println("Customer: " + booking.customerName);
                System.out.println("Flight Code: " + booking.flightCode);
                System.out.println("Payment Method: " + booking.paymentMethod);
                System.out.println("Ticket Price: $" + booking.ticketPrice);
                System.out.println("Seat Number: " + booking.seatNumber);
                System.out.println("Seat Class: " + booking.seatClass);
                System.out.println("===============================================");
            }
        }
    }

    // Method to process payment with a specific method and amount
    public static void processPayment(String paymentMethod, double amount) {
        // Simulate actual payment processing
        System.out.println("Processing payment of $" + amount + " using " + paymentMethod + "...");
        System.out.println("Payment successful!");
    }
    // Improvement: Allow flexible ticket pricing based on seat class.
    // Method to calculate ticket price based on seat class
    public static double calculateTicketPrice(SeatClass seatClass) {
        return switch (seatClass) {
            case ECONOMY -> 150.00;
            case PREMIUM_ECONOMY -> 200.00;
            case BUSINESS -> 300.00;
            case FIRST_CLASS -> 500.00;
        };
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String customerName;
        String flightCode;
        String paymentMethod;
        double ticketPrice;
        int option;

        // Array of available seat numbers
        String[] seats = {"1A", "1B", "2A", "2B", "3A", "3B"};

        // Main menu loop for the booking system
        while (true) {
            System.out.println("Select an option: ");
            System.out.println("1: Book a flight");
            System.out.println("2: View all bookings");
            System.out.println("3: Exit");

            try {
                option = kb.nextInt();
                kb.nextLine(); // Consume newline
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                kb.nextLine(); // Consume the invalid input
                continue; // Ask for input again
            }

            switch (option) {
                case 1 -> {
                    // Gather booking details from the user
                    System.out.println("Enter your name: ");
                    customerName = kb.nextLine();

                    System.out.println("Enter flight code: ");
                    flightCode = kb.nextLine();

                    System.out.println("Enter payment method (e.g., Credit Card, PayPal): ");
                    paymentMethod = kb.nextLine();

                    // Display available seats
                    System.out.println("Available seats:");
                    for (String seat : seats) {
                        System.out.println("- " + seat);
                    }
                    System.out.println("Enter seat number: ");
                    String seatNumber = kb.nextLine();

                    // Check if seat number is valid
                    if (!Arrays.asList(seats).contains(seatNumber)) {
                        System.out.println("Invalid seat selection. Please choose a seat from the available options.");
                        continue;
                    }

                    // Choose seat class
                    System.out.println("Select seat class: ");
                    System.out.println("1: Economy");
                    System.out.println("2: Premium Economy");
                    System.out.println("3: Business");
                    System.out.println("4: First Class");
                    //Improvement: validate the number that the customer will choose
                    int classOption = -1; // Initialize with an invalid value
                    while (classOption < 1 || classOption > 4) {
                        try {
                            classOption = kb.nextInt();
                            kb.nextLine(); // Consume newline
                            if (classOption < 1 || classOption > 4) {
                                System.out.println("Invalid choice. Please select a valid seat class (1-4).");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Invalid input! Please enter a valid number between 1 and 4.");
                            kb.nextLine(); // Consume invalid input
                        }
                    }

                    // Determine seat class and ticket price based on user selection
                    SeatClass seatClass;
                    switch (classOption) {
                        case 1 -> seatClass = SeatClass.ECONOMY;
                        case 2 -> seatClass = SeatClass.PREMIUM_ECONOMY;
                        case 3 -> seatClass = SeatClass.BUSINESS;
                        case 4 -> seatClass = SeatClass.FIRST_CLASS;
                        default -> seatClass = SeatClass.ECONOMY; // Default to Economy
                    }

                    // Calculate ticket price based on seat class
                    ticketPrice = calculateTicketPrice(seatClass);

                    // Add the booking and process payment
                    Booking.addBooking(customerName, flightCode, paymentMethod, ticketPrice, seatNumber, seatClass);
                    processPayment(paymentMethod, ticketPrice);
                }
                case 2 -> Booking.displayAllBookings(); // Display all bookings
                case 3 -> {
                    // Exit the program
                    System.out.println("Thank you for using our system.");
                    kb.close();
                    System.exit(0);
                }
                default -> System.out.println("Please select a valid option.");
            }
        }
    }
}