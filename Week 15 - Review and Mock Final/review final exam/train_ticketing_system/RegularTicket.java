package train_ticketing_system;

public class RegularTicket extends TrainTicket {
    public RegularTicket(String passenger, double baseFare) {
        super(passenger, baseFare);
    }

    @Override
    public double getFinalPrice() {
        return baseFare;
    }
}
