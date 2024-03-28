public class CustomerLoyaltyStatus {

    private double discount;

    public CustomerLoyaltyStatus(double discount) {
        this.discount = discount;
    }

    public double applyDiscount(double totalPrice) {
        return totalPrice * (1 - discount);

    }
}
