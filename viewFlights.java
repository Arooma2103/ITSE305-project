
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

// classes representing presentation, business, and data layers. 
// Each class and its methods must have sufficient descriptive comments. 


public class viewFlights {

    public static class flights{
        //data layer representing the data needed for flights
        // Proposed Change 1: Make fields private and provide getter methods for encapsulation.
        // This helps in better object-oriented design and promotes data encapsulation, making the fields more secure and maintainable.
        String airlineName;
        LocalDate travelDate;
        LocalTime DepTime;
        LocalTime arrTime;
        String flightCode;
        String originCountry;
        String toCountry;

        private static final ArrayList<flights> availableFlights = new ArrayList<>();

        //constructor
        public flights(String airlineName, LocalDate travelDate, LocalTime DepTime, LocalTime arrTime, String flightCode, String originCountry, String toCountry){
            this.airlineName = airlineName;
            this.travelDate = travelDate;
            this.DepTime = DepTime;
            this.arrTime = arrTime;
            this.flightCode = flightCode;
            this.originCountry = originCountry;
            this.toCountry = toCountry;
        }

        //flights available
        static{
            availableFlights.add(new flights("Emirates", LocalDate.of(2024, 12, 6), LocalTime.of(5, 30), LocalTime.of(7, 30), "FL234", "Bahrain", "Dubai"));
            availableFlights.add(new flights("Gulf Air", LocalDate.of(2024, 3, 12), LocalTime.of(3, 00), LocalTime.of(7, 00), "FL123", "Bahrain", "Egypt"));
            availableFlights.add(new flights("Air Arabia", LocalDate.of(2024, 6, 26), LocalTime.of(4, 00), LocalTime.of(5, 30), "FL789", "Bahrain", "Abu Dhabi"));
            availableFlights.add(new flights("Qatar Airways", LocalDate.of(2024, 2, 11), LocalTime.of(7, 00), LocalTime.of(8, 00), "FL179", "Bahrain", "Qatar"));
            availableFlights.add(new flights("Gulf Air", LocalDate.of(2024, 7, 7), LocalTime.of(4, 00), LocalTime.of(10, 30), "FL901", "Bahrain", "London"));
        }

        //Business layer - Show all available flights, search by destinations, and by flight code
        //1. Available Flights
        public static void displayAllFlights(){
            for(flights flight : availableFlights){         //every element in available flights as flight
                System.out.println("Airline: " + flight.airlineName);
                System.out.println("From: " + flight.originCountry + " to " + flight.toCountry);
                System.out.println("Date: " + flight.travelDate);
                System.out.println("Time: " + flight.DepTime + " to " + flight.arrTime);
                System.out.println("Code: " + flight.flightCode);
                System.out.println("===============================================");
            }
        }

        //2. Search by destination
        public static void findByDandT(String destination){
            int count = 0;
            for(flights flight : availableFlights){
                if(flight.toCountry.equalsIgnoreCase(destination)){
                    count++;
                    System.out.println("Airline: " + flight.airlineName);
                    System.out.println("From: " + flight.originCountry + " to " + flight.toCountry);
                    System.out.println("Date: " + flight.travelDate);
                    System.out.println("Time: " + flight.DepTime + " to " + flight.arrTime);
                    System.out.println("Code: " + flight.flightCode);
                    System.out.println("===============================================");
                }
            }
            if(count == 0){
                System.out.println("No flights available");
            }
        }

        //3. Search by flight code
        public static void findByCode(String code){
            int count = 0;
            for(flights flight : availableFlights){
                if(flight.flightCode.equalsIgnoreCase(code)){
                    count++;
                    System.out.println("Airline: " + flight.airlineName);
                    System.out.println("From: " + flight.originCountry + " to " + flight.toCountry);
                    System.out.println("Date: " + flight.travelDate);
                    System.out.println("Time: " + flight.DepTime + " to " + flight.arrTime);
                    System.out.println("Code: " + flight.flightCode);
                    System.out.println("===============================================");
                }
            }
            if(count == 0){
                System.out.println("No flights available");
            }
    }
}
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner kb = new Scanner(System.in);
        int option;
        boolean avail = true;
        String yn;
        String dest;
        String fCode;

        //presentation layer
        // Proposed Change 2: Use a switch expression to simplify the flow and avoid repetitive code.
        // The current design repeatedly asks the user if they want to search more after each option. We can simplify this using a loop and removing repetition.

        while(avail){
            System.out.println("Select an option: ");
            System.out.println("1: View all available flights ");
            System.out.println("2: Search flight by destination");
            System.out.println("3: Search flight by flight code ");
            System.out.println("4: Exit ");
            option = kb.nextInt();
            switch(option){
                case 1 -> {
                    flights.displayAllFlights();
                    System.out.println("Search more? Y/N");
                    yn = kb.next();
                    if("N".equalsIgnoreCase(yn)){
                        avail = false;
                    }
                    else if("Y".equalsIgnoreCase(yn)){
                        avail = true;
                    }
                    else{
                        System.out.println("invalid input, retry.");
                    }
                    break;
                }
                case 2 -> {
                    System.out.println("What is your destination? ");
                    dest = kb.next();
                    flights.findByDandT(dest);
                    System.out.println("Search more? Y/N");
                    yn = kb.next();
                    if("N".equalsIgnoreCase(yn)){
                        avail = false;
                    }
                    else if("Y".equalsIgnoreCase(yn)){
                        avail = true;
                    }
                    else{
                        System.out.println("invalid input, retry.");
                    }
                    break;
                }
                case 3 -> {
                    System.out.println("Enter the flight code: ");
                    fCode = kb.next();
                    flights.findByCode(fCode);
                    System.out.println("Search more? Y/N");
                    yn = kb.next();
                    if("N".equalsIgnoreCase(yn)){
                        avail = false;
                    }
                    else if("Y".equalsIgnoreCase(yn)){
                        avail = true;
                    }
                    else{
                        System.out.println("invalid input, retry.");
                    }
                    break;
                }
                case 4 -> {
                    System.out.println("Thank you for using our system.");
                    System.exit(0);
                }
                default -> {
                    System.out.println("Please select one of the available options");
                }
            }
        }

        System.out.println("Thank you for using our system.");
        System.exit(0);
    }
    // Proposed Change 3: Refactor repetitive code for handling the "Search more?" prompt into a method
    // This method will handle asking whether the user wants to continue searching, reducing duplication.
    
}
