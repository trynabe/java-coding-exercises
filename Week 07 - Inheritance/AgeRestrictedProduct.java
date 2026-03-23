/**
 *
 * Modify this class to inherit from Product class
 *
 */

public class AgeRestrictedProduct extends Product {
	private int minimumAge;

	// TODO 1: constructor
	public AgeRestrictedProduct(String name, double price, int minAge) {
		// YOUR CODE HERE
		super(name, price);
		this.minimumAge = minAge;
		System.out.println("Age-restricted product is created ...");
	}
	
	// TODO 2: setter and getter
	public void setMinimumAge(int age) {
		// YOUR CODE HERE
		this.minimumAge = age;
	}
	
	public int getMinimumAge() {
		// YOUR CODE HERE
		return this.minimumAge;
	}
	
	// TODO 3: check eligibility
	public boolean isEligible(int age) {
		// YOUR CODE HERE
		return age >= this.minimumAge;
	}
	
	// TODO 4: toString method
	@Override
	public String toString() {
		// YOUR CODE HERE
		return super.toString() + ", Minimum Age: " + this.minimumAge;
	}
}
