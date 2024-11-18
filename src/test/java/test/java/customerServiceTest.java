package test.java;

import main.java.customerService.ServiceRequest;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class customerServiceTest {

    @Test
    void testDisplayAllRequests() {
        ArrayList<ServiceRequest> requests = ServiceRequest.getServiceRequests();
        assertNotNull(requests, "Service requests should not be null");
        assertTrue(requests.size() > 0, "Service requests should not be empty");
    }

    @Test
    void testFindByCustomerName() {
        String testName = "John Doe";

        // Use the method and capture the expected result
        ServiceRequest.findByCustomerName(testName);

        // Validate if the customer exists in the service requests
        boolean found = ServiceRequest.getServiceRequests().stream()
                .anyMatch(request -> request.customerName.equalsIgnoreCase(testName));
        assertTrue(found, "Customer with the name '" + testName + "' should exist in the service requests.");
    }

    @Test
    void testUpdateStatus() {
        String testName = "Jane Smith";
        String newStatus = "Closed";

        // Update status using the method
        ServiceRequest.updateStatus(testName, newStatus);

        // Validate that the status is updated correctly
        ServiceRequest updatedRequest = ServiceRequest.getServiceRequests().stream()
                .filter(request -> request.customerName.equalsIgnoreCase(testName))
                .findFirst()
                .orElse(null);

        assertNotNull(updatedRequest, "Service request for customer '" + testName + "' should exist.");
        assertEquals(newStatus, updatedRequest.status, "Status should be updated correctly to '" + newStatus + "'.");
    }
}
