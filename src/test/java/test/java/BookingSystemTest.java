package test.java;

import main.java.BookingSystem;
import main.java.SeatClass;
import main.java.SeatClass;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingSystemTest {

    @Test
    void testAddBooking() {
        // Add a new booking
        BookingSystem.Booking.addBooking("Alice", "FL123", "Credit Card", 150.00, "1A", SeatClass.ECONOMY);

        // Verify the booking was added
        assertEquals(1, BookingSystem.Booking.getBookings().size(), "Booking should be added successfully.");
    }

    @Test
    void testDuplicateSeat() {
        // Add a booking
        BookingSystem.Booking.addBooking("Alice", "FL123", "Credit Card", 150.00, "1A", SeatClass.ECONOMY);

        // Try adding a duplicate seat
        BookingSystem.Booking.addBooking("Bob", "FL123", "PayPal", 150.00, "1A", SeatClass.BUSINESS);

        // Verify only one booking exists
        assertEquals(1, BookingSystem.Booking.getBookings().size(), "Duplicate booking should not be allowed.");
    }

    @Test
    void testViewAllBookings() {
        // Add bookings
        BookingSystem.Booking.addBooking("Alice", "FL123", "Credit Card", 150.00, "1A", SeatClass.ECONOMY);
        BookingSystem.Booking.addBooking("Bob", "FL123", "PayPal", 150.00, "1B", SeatClass.BUSINESS);

        // Verify all bookings are displayed
        assertEquals(2, BookingSystem.Booking.getBookings().size(), "All bookings should be displayed.");
    }
}
