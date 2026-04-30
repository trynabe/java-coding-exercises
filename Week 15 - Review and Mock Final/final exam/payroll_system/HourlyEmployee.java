public class HourlyEmployee implements Payable {
    int hours;

    public HourlyEmployee(int hours) {
        if (hours <= 0) {
            throw new IllegalArgumentException("จำนวนต้องมากกว่าศูนย์");
        }
        this.hours = hours;
    }
    @Override
    public double calculatePay() {
        return hours * 120.0;
    }
}
