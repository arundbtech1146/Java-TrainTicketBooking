import java.util.Scanner;

class TrainTicketBooking {
    static int availableSeatsFirstClass = 50;
    static int availableSeatsSecondClass = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Train Ticket Booking System");

        while (true) {
            System.out.println("\nPlease select an option:");
            System.out.println("1. Book Ticket");
            System.out.println("2. Check Available Seats");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    bookTicket(scanner);
                    break;
                case 2:
                    checkAvailableSeats();
                    break;
                case 3:
                    System.out.println("Thank you for using the Train Ticket Booking System.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }

    static void bookTicket(Scanner scanner) {
        System.out.print("Enter class (1 for First Class, 2 for Second Class): ");
        int ticketClass = scanner.nextInt();

        System.out.print("Enter number of seats to book: ");
        int numSeats = scanner.nextInt();

        if (ticketClass == 1) {
            if (availableSeatsFirstClass >= numSeats) {
                availableSeatsFirstClass -= numSeats;
                System.out.println("Ticket(s) booked successfully for First Class.");
                System.out.println("Remaining seats in First Class: " + availableSeatsFirstClass);
            } else {
                System.out.println("Insufficient seats available in First Class.");
            }
        } else if (ticketClass == 2) {
            if (availableSeatsSecondClass >= numSeats) {
                availableSeatsSecondClass -= numSeats;
                System.out.println("Ticket(s) booked successfully for Second Class.");
                System.out.println("Remaining seats in Second Class: " + availableSeatsSecondClass);
            } else {
                System.out.println("Insufficient seats available in Second Class.");
            }
        } else {
            System.out.println("Invalid class. Please enter 1 for First Class or 2 for Second Class.");
        }
    }

    static void checkAvailableSeats() {
        System.out.println("Available seats in First Class: " + availableSeatsFirstClass);
        System.out.println("Available seats in Second Class: " + availableSeatsSecondClass);
    }
}
