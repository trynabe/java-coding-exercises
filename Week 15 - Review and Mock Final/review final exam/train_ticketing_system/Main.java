package train_ticketing_system;

public class Main {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie"};
        String[] ticketType = {"Regular", "Student", "Regular"};
        double[] fare = {100.0, 100.0, -120.0};

        TrainTicket[] tickets = new TrainTicket[3];

        for (int i = 0; i < names.length; i++) {
            try {
                if (ticketType[i].equals("Regular")) {
                    tickets[i] = new RegularTicket(names[i], fare[i]);
                } else if (ticketType[i].equals("Student")) {
                    tickets[i] = new StudentTicket(names[i], fare[i]);
                }
                System.out.println("Passenger: " + tickets[i].passengerName + " -> " + tickets[i].getFinalPrice() + " Baht");
            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
