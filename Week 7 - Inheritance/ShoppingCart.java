import java.util.ArrayList;

public class ShoppingCart {

    private ArrayList<Product> products;
    private int customerAge;
    private int purchaseHour;   // for Time-restricted products
    private boolean isMember;   // for Subscription products

    public ShoppingCart(int customerAge) {
        this.products    = new ArrayList<Product>();
        this.customerAge = customerAge;
        this.purchaseHour = java.time.LocalTime.now().getHour(); // default = current hour
        this.isMember    = false;
        System.out.println("Shopping Cart is created ... ");
    }

    public void setCustomerAge(int age)      { this.customerAge = age; }
    public int  getCustomerAge()             { return this.customerAge; }
    public void setPurchaseHour(int hour)    { this.purchaseHour = hour; }
    public int  getPurchaseHour()            { return this.purchaseHour; }
    public void setMember(boolean isMember)  { this.isMember = isMember; }
    public boolean isMember()               { return this.isMember; }

    // TODO 5: add product
    public void addProduct(Product product) {

        // Check AgeRestrictedProduct
        if (product instanceof AgeRestrictedProduct) {
            AgeRestrictedProduct arp = (AgeRestrictedProduct) product;
            if (!arp.isEligible(this.customerAge)) {
                System.out.println("You are not eligible to purchase " + product.getName());
                return;
            }
        }

        // Check Time-restricted product
        if (product instanceof Time) {
            Time tp = (Time) product;
            if (!tp.isAvailable(this.purchaseHour)) {
                System.out.println("You are not eligible to purchase " + product.getName());
                return;
            }
        }

        // Check Subscription product
        if (product instanceof Subscription) {
            Subscription sp = (Subscription) product;
            if (!sp.isEligible(this.isMember)) {
                System.out.println("You are not eligible to purchase " + product.getName());
                return;
            }
        }

        products.add(product);
        System.out.println(product.getName() + " added to cart");
    }

    // TODO 6: calculate total price
    public double calculateTotalPrice() {
        double total = 0.0;
        for (Product p : products) {
            total += p.getPrice();
        }
        return total;
    }

    public void clear() {
        products.clear();
        System.out.println("Shopping Cart is cleared ... ");
    }


    // DO NOT MODIFY MAIN
    public static void main(String[] args) {
        System.out.println("Creating Products");
        Product candy = new Product("Candy", 25.00);

        Time cookie = new Time("Cookie", 10.00, 8, 17);
        Subscription coke = new Subscription("Coke", 10, true);

        AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
        System.out.println("------------------------------------------\n");

        ShoppingCart cart = new ShoppingCart(20);
        cart.addProduct(candy);
        cart.addProduct(wine);
        cart.addProduct(cookie);
        cart.addProduct(coke);

        System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
        System.out.println("Total price: " + cart.calculateTotalPrice());
        System.out.println("------------------------------------------\n");


        cart.clear();
        cart.setCustomerAge(35);
        cart.addProduct(candy);
        cart.addProduct(wine);

        System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
        System.out.println("Total price: " + cart.calculateTotalPrice());
        System.out.println("------------------------------------------\n");
    }
}