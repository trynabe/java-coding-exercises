public class DailyEmployee implements Payable {
    private int days;

    public DailyEmployee(int days) {
        if (days <= 0) {
            throw new IllegalArgumentException("จำนวนต้องมากกว่าศูนย์");
        }
        this.days = days;
    }
    @Override
    public double calculatePay() {
        return days * 600.0;
    }
}
