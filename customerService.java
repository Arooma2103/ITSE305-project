import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class customerService {

    // Data Layer - Representing customer service requests and details
    public static class ServiceRequest {
        // Changed attributes to private and added getters and setters for controlled access
        private String customerName; // Encapsulated
        private String contactNumber; // Encapsulated
        private LocalDate requestDate; // Encapsulated
        private String issueDescription; // Encapsulated
        private String status; // Encapsulated

        private static final ArrayList<ServiceRequest> serviceRequests = new ArrayList<>();

        // Constructor
        public ServiceRequest(String customerName, String contactNumber, LocalDate requestDate, String issueDescription, String status) {
            this.customerName = customerName;
            this.contactNumber = contactNumber;
            this.requestDate = requestDate;
            this.issueDescription = issueDescription;
            this.status = status;
        }

        // Getters and setters for controlled access
        public String getCustomerName() {
            return customerName;
        }

        public void setCustomerName(String customerName) {
            this.customerName = customerName;
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            this.contactNumber = contactNumber;
        }

        public LocalDate getRequestDate() {
            return requestDate;
        }

        public void setRequestDate(LocalDate requestDate) {
            this.requestDate = requestDate;
        }

        public String getIssueDescription() {
            return issueDescription;
        }

        public void setIssueDescription(String issueDescription) {
            this.issueDescription = issueDescription;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        // Static block to add sample data
        static {
            serviceRequests.add(new ServiceRequest("John Doe", "1234567890", LocalDate.of(2024, 10, 25), "Issue with flight booking", "Open"));
            serviceRequests.add(new ServiceRequest("Jane Smith", "0987654321", LocalDate.of(2024, 10, 26), "Request for refund", "In Progress"));
        }

        // Display all service requests
        public static void displayAllRequests() {
            for (ServiceRequest request : serviceRequests) {
                System.out.println("Customer Name: " + request.getCustomerName());
                System.out.println("Contact Number: " + request.getContactNumber());
                System.out.println("Date: " + request.getRequestDate());
                System.out.println("Issue: " + request.getIssueDescription());
                System.out.println("Status: " + request.getStatus());
                System.out.println("===============================================");
            }
        }

        // Search for service requests by customer name (case-insensitive comparison)
        public static void findByCustomerName(String name) {
            int count = 0;
            for (ServiceRequest request : serviceRequests) {
                if (request.getCustomerName().equalsIgnoreCase(name)) { // Case-insensitive comparison
                    count++;
                    System.out.println("Customer Name: " + request.getCustomerName());
                    System.out.println("Contact Number: " + request.getContactNumber());
                    System.out.println("Date: " + request.getRequestDate());
                    System.out.println("Issue: " + request.getIssueDescription());
                    System.out.println("Status: " + request.getStatus());
                    System.out.println("===============================================");
                }
            }
            if (count > 0) {
                System.out.println("Found " + count + " request(s).");
            } else {
                System.out.println("No service requests found for customer: " + name);
            }
        }

        // Update the status of a service request
        public static void updateStatus(String customerName, String newStatus) {
            boolean updated = false;
            for (ServiceRequest request : serviceRequests) {
                if (request.getCustomerName().equalsIgnoreCase(customerName)) { // Case-insensitive comparison
                    request.setStatus(newStatus); // Use setter to update
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
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("Select an option:");
            System.out.println("1: View all service requests");
            System.out.println("2: Search service requests by customer name");
            System.out.println("3: Update service request status");
            System.out.println("4: Exit");

            // Added error handling for invalid numeric input
            int option = 0;
            try {
                option = Integer.parseInt(kb.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a number.");
                continue; // Retry input
            }

            switch (option) {
                case 1 -> {
                    ServiceRequest.displayAllRequests();
                }
                case 2 -> {
                    System.out.println("Enter the customer name to search:");
                    String customerName = kb.nextLine();
                    ServiceRequest.findByCustomerName(customerName);
                }
                case 3 -> {
                    System.out.println("Enter the customer name to update the status:");
                    String customerName = kb.nextLine();
                    System.out.println("Enter the new status (e.g., Open, In Progress, Closed):");
                    String newStatus = kb.nextLine();
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

