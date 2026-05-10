public class JapaneseFood extends MenuItem {
    public JapaneseFood(String name, double price) {
        super(name, price);
    }
    
    private double calculateBasePrice(int q) {
        if (q <= 0) {
            return 0;
        }
        return this.price + calculateBasePrice(q - 1);
    }

    @Override
    public double calculateDiscountedPrice(int quantity) {
        double total = calculateBasePrice(quantity);
        if (quantity > 3) {
            return total * 0.9;
        }
        return total;
    }
}
