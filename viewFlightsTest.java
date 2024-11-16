import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class viewFlightsTest {

    //helper method to capture console output
    private String captureConsoleOutput(Runnable task) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outputStream));
        task.run();
        System.setOut(originalOut);
        return outputStream.toString();
    }

    @Test
    public void testDisplayAllFlights() {
        //capture the console output of displayAllFlights
        String output = captureConsoleOutput(viewFlights.flights::displayAllFlights);

        //assert that the output contains expected flight details
        Assertions.assertTrue(output.contains("Airline: Emirates"), "Output should contain flight details for Emirates.");
        Assertions.assertTrue(output.contains("From: Bahrain to Dubai"), "Output should contain flight details for Bahrain to Dubai.");
        Assertions.assertTrue(output.contains("Airline: Gulf Air"), "Output should contain flight details for Gulf Air.");
        Assertions.assertTrue(output.contains("From: Bahrain to Egypt"), "Output should contain flight details for Bahrain to Egypt.");
    }

    @Test
    public void testFindByDandT_Found() {
        //test for a destination that exists
        String output = captureConsoleOutput(() -> viewFlights.flights.findByDandT("Dubai"));
        Assertions.assertTrue(output.contains("Airline: Emirates"), "Output should contain flight details for Emirates to Dubai.");
        Assertions.assertTrue(output.contains("From: Bahrain to Dubai"), "Output should contain the correct route for Dubai.");
    }

    @Test
    public void testFindByDandT_NotFound() {
        //test for a destination that doesn't exist
        String output = captureConsoleOutput(() -> viewFlights.flights.findByDandT("Greece"));
        Assertions.assertTrue(output.contains("No flights available"), "Output should indicate that no flights are available to Greece.");
    }

    @Test
    public void testFindByCode_Found() {
        //test for a flight code that exists
        String output = captureConsoleOutput(() -> viewFlights.flights.findByCode("FL234"));
        Assertions.assertTrue(output.contains("Airline: Emirates"), "Output should contain flight details for Emirates with code FL234.");
        Assertions.assertTrue(output.contains("From: Bahrain to Dubai"), "Output should contain the correct route for flight code FL234.");
    }

    @Test
    public void testFindByCode_NotFound() {
        //test for a flight code that doesn't exist
        String output = captureConsoleOutput(() -> viewFlights.flights.findByCode("FL000"));
        Assertions.assertTrue(output.contains("No flights available"), "Output should indicate that no flights are available for code FL000.");
    }
}
