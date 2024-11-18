package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

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

        // Method to return all bookings for testing purposes
        public static ArrayList<Booking> getBookings() {
            return bookings;
        }
    }

    // Method to process payment with a specific method and amount
    public static void processPayment(String paymentMethod, double amount) {
        System.out.println("Processing payment of $" + amount + " using " + paymentMethod + "...");
        System.out.println("Payment successful!");
    }

    // Main method: program entry point
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String customerName;
        String flightCode;
        String paymentMethod;
        double ticketPrice = 150.00; // Fixed price for simplicity
        int option;

        // Array of available seat numbers
        String[] seats = {"1A", "1B", "2A", "2B", "3A", "3B"}; // Example seat options

        // Main menu loop for the booking system
        while (true) {
            System.out.println("Select an option: ");
            System.out.println("1: Book a flight");
            System.out.println("2: View all bookings");
            System.out.println("3: Exit");
            option = kb.nextInt();
            kb.nextLine(); // Consume newline

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
                    int classOption = kb.nextInt();
                    kb.nextLine(); // Consume newline

                    // Determine seat class based on user selection
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
