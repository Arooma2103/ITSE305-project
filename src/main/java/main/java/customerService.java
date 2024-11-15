package main.java;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import main.java.customerService.ServiceRequest;


public class customerService {

    // Data Layer - Representing customer service requests and details
    public static class ServiceRequest {
        public String customerName;
        public String status;
        String contactNumber;
        LocalDate requestDate;
        String issueDescription;
     // e.g., Open, In Progress, Closed

        private static final ArrayList<ServiceRequest> serviceRequests = new ArrayList<>();

        // Constructor to initialize a service request
        public ServiceRequest(String customerName, String contactNumber, LocalDate requestDate, String issueDescription, String status) {
            this.customerName = customerName;
            this.contactNumber = contactNumber;
            this.requestDate = requestDate;
            this.issueDescription = issueDescription;
            this.status = status;
        }

        // Static block to add some sample data for testing
        static {
            serviceRequests.add(new ServiceRequest("John Doe", "1234567890", LocalDate.of(2024, 10, 25), "Issue with flight booking", "Open"));
            serviceRequests.add(new ServiceRequest("Jane Smith", "0987654321", LocalDate.of(2024, 10, 26), "Request for refund", "In Progress"));
        }

        // Public getter method for serviceRequests
        public static ArrayList<ServiceRequest> getServiceRequests() {
            return serviceRequests;
        }

        // Business Layer - Methods for managing service requests
        public static void displayAllRequests() {
            for (ServiceRequest request : serviceRequests) {
                System.out.println("Customer Name: " + request.customerName);
                System.out.println("Contact Number: " + request.contactNumber);
                System.out.println("Date: " + request.requestDate);
                System.out.println("Issue: " + request.issueDescription);
                System.out.println("Status: " + request.status);
                System.out.println("===============================================");
            }
        }

        public static void findByCustomerName(String name) {
            int count = 0;
            for (ServiceRequest request : serviceRequests) {
                if (request.customerName.equalsIgnoreCase(name)) {
                    count++;
                    System.out.println("Customer Name: " + request.customerName);
                    System.out.println("Contact Number: " + request.contactNumber);
                    System.out.println("Date: " + request.requestDate);
                    System.out.println("Issue: " + request.issueDescription);
                    System.out.println("Status: " + request.status);
                    System.out.println("===============================================");
                }
            }
            if (count == 0) {
                System.out.println("No service requests found for customer: " + name);
            }
        }

        public static void updateStatus(String customerName, String newStatus) {
            boolean updated = false;
            for (ServiceRequest request : serviceRequests) {
                if (request.customerName.equalsIgnoreCase(customerName)) {
                    request.status = newStatus;
                    updated = true;
                    System.out.println("Status updated successfully for " + customerName + " to " + newStatus);
                    break;
                }
            }
            if (!updated) {
                System.out.println("No service request found for customer: " + customerName);
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int option;
        boolean running = true;
        String customerName;
        String newStatus;

        while (running) {
            System.out.println("Select an option:");
            System.out.println("1: View all service requests");
            System.out.println("2: Search service requests by customer name");
            System.out.println("3: Update service request status");
            System.out.println("4: Exit");
            option = kb.nextInt();
            kb.nextLine(); // Clear the newline character

            switch (option) {
                case 1 -> ServiceRequest.displayAllRequests();
                case 2 -> {
                    System.out.println("Enter the customer name to search:");
                    customerName = kb.nextLine();
                    ServiceRequest.findByCustomerName(customerName);
                }
                case 3 -> {
                    System.out.println("Enter the customer name to update the status:");
                    customerName = kb.nextLine();
                    System.out.println("Enter the new status (e.g., Open, In Progress, Closed):");
                    newStatus = kb.nextLine();
                    ServiceRequest.updateStatus(customerName, newStatus);
                }
                case 4 -> {
                    System.out.println("Thank you for using our customer service system.");
                    running = false;
                }
                default -> System.out.println("Please select a valid option.");
            }
        }

        System.out.println("System exited.");
    }
}
