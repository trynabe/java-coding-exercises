import java.util.ArrayList;

public class ShoppingCart {
	
	private ArrayList<Product> products;
	private int customerAge;
	
	
	public ShoppingCart(int customerAge) {
		this.products = new ArrayList<Product>();
		this.customerAge = customerAge;
		System.out.println("Shopping Cart is created ... ");
	}
	
	public void setCustomerAge(int age) {
		this.customerAge = age;
	}
	
	public int getCustomerAge() {
		return this.customerAge;
	}
	
	// TODO 5: add product
	public void addProduct(Product product) {
		// YOUR CODE HERE
		if (product instanceof AgeRestrictedProduct) {
			AgeRestrictedProduct arp = (AgeRestrictedProduct) product;
				if (!arp.isEligible(this.customerAge)) {
					System.out.println("You are not eligible to purchase " + product.getName());
					return ;
			}
		}
		products.add(product);
	}
	
	// TODO 6: calculate total price
	public double calculateTotalPrice() {
		// YOUR CODE HERE
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
		AgeRestrictedProduct wine = new AgeRestrictedProduct("Wine", 999, 21);
		System.out.println("------------------------------------------\n");
		
		ShoppingCart cart = new ShoppingCart(20);
		cart.addProduct(candy);
		cart.addProduct(wine);
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge()+ ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
		
		cart.clear();				// clear shopping cart (remove all products in the cart)
		cart.setCustomerAge(35);	// change the customer age to 35 years old
		cart.addProduct(candy);
		cart.addProduct(wine);
		
		System.out.println("\nChecking out (Age:" + cart.getCustomerAge() + ")");
		System.out.println("Total price: " + cart.calculateTotalPrice());
		System.out.println("------------------------------------------\n");
		
	}

}