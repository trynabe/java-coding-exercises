package send_a_parcel;

public class FlashService extends ParcelService implements Billable {
    public FlashService(String serviceName, double weightInKg) {
        super(serviceName, weightInKg);
    }

    @Override
    public double getRatePerKg() {
        return 35.0;
    }

    @Override
    public double calculateBill() {
        return weightInKg * getRatePerKg();
    }
}
