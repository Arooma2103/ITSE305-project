package main.java;

import java.util.Scanner;

public class FlightBookingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("\nFlight Booking System");
            System.out.println("1. Booking System");
            System.out.println("2. View Flights");
            System.out.println("3. Customer Service");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");

            option = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (option) {
                case 1:
                    BookingSystem.main(args);
                    break;
                case 2:
                    viewFlights.main(args);
                    break;
                case 3:
                    customerService.main(args);
                    break;
                case 4:
                    System.out.println("Thank you for using the Flight Booking System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}

