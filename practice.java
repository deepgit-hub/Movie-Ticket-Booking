import java.util.Scanner;

class TheatreBooking {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[] movieNames = {
                "LEO", "JAILER", "VIKRAM",
                "DHURANDHAR", "SIRAI", "F1", "RAPUNZEL"
        };

        int[] screens = {1, 2, 2, 3, 3, 3, 3};

        int[] prices = {200, 180, 180, 150, 150, 150, 150};

        int[] availableSeats = {500, 350, 350, 350, 350, 350, 350};

        boolean running = true;

        System.out.println("--------------------------------------");
        System.out.println("<----- Welcome to SAKTHI CINEMAS ----->");
        System.out.println("--------------------------------------");

        while (running) {

            System.out.println("\n========= Movies Running =========");
            for (int i = 0; i < movieNames.length; i++) {
                System.out.println((i + 1) + ". " + movieNames[i]);
            }

            System.out.print("\nSelect Movie (1-" + movieNames.length + "): ");
            int choice = scan.nextInt();

            if (choice < 1 || choice > movieNames.length) {
                System.out.println("Invalid movie selection!");
                continue;
            }

            int index = choice - 1;

            System.out.println("\n----- Movie Details -----");
            System.out.println("Movie Name   : " + movieNames[index]);
            System.out.println("Screen       : " + screens[index]);
            System.out.println("Ticket Price : ₹" + prices[index]);
            System.out.println("Available Seats : " + availableSeats[index]);

            System.out.print("\nEnter number of seats (0 to go back): ");
            int seats = scan.nextInt();

            if (seats == 0) {
                continue;
            }

            if (seats < 0) {
                System.out.println("Seats cannot be negative!");
                continue;
            }

            if (seats > availableSeats[index]) {
                System.out.println("Not enough seats available!");
                continue;
            }

            int totalPrice = seats * prices[index];

            availableSeats[index] -= seats;

            System.out.println("\n====== Booking Summary ======");
            System.out.println("Movie       : " + movieNames[index]);
            System.out.println("Screen      : " + screens[index]);
            System.out.println("Seats       : " + seats);
            System.out.println("Total Price : ₹" + totalPrice);
            System.out.println("=============================");

            System.out.println("\n1. Book Another Movie");
            System.out.println("2. Exit");
            System.out.print("Enter choice: ");
            int option = scan.nextInt();

            if (option == 2) {
                running = false;
                System.out.println("\nThank you! Visit Again 🎬");
            }
        }

        scan.close();
    }
}
