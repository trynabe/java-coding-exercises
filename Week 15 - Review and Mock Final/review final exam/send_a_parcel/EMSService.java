package send_a_parcel;

public class EMSService extends ParcelService implements Billable {
    public EMSService(String serviceName, double weightInKg) {
        super(serviceName, weightInKg);  
    }

    @Override
    public double getRatePerKg() {
        return 50.0;
    }
    
    @Override
    public double calculateBill() {
        return weightInKg * getRatePerKg();
    }
}
