public class Subscription extends Product {
    private boolean memberOnly;
 
    public Subscription(String name, double price, boolean memberOnly) {
        super(name, price);
        this.memberOnly = memberOnly;
        System.out.println("Subscription product is created ...");
    }
 
    public void setMemberOnly(boolean memberOnly) { this.memberOnly = memberOnly; }
    public boolean isMemberOnly()                 { return memberOnly; }
 
    // Returns true if the customer is allowed to buy this product
    public boolean isEligible(boolean isMember) {
        return !memberOnly || isMember;
    }
 
    @Override
    public String toString() {
        return super.toString() + ", Member Only: " + memberOnly;
    }
}
