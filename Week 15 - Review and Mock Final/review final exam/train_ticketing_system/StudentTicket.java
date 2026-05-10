package train_ticketing_system;

public class StudentTicket extends TrainTicket {
    public StudentTicket(String passenger, double baseFare) {
        super(passenger, baseFare);
    }

    @Override
    public double getFinalPrice() {
        return baseFare * 0.8;
    }
}
