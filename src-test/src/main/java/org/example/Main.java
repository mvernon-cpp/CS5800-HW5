
public class Main {
    public static void main(String[] args) {
        CustomerLoyaltyStatus fivePercent = new CustomerLoyaltyStatus( 0.05 );
        CustomerLoyaltyStatus tenPercent = new CustomerLoyaltyStatus( 0.1 );
        CustomerLoyaltyStatus twentyPercent = new CustomerLoyaltyStatus( 0.2 );

        System.out.println("First Customer's Order: (10% Discount)");
        CustomerOrder order1 = new CustomerOrder();
        order1.addToOrder( new Burger() );
        order1.addToOrder( new Ketchup( new Burger() ) );
        order1.addToOrder( new Relish(new Mustard( new Ketchup( new HotDog() ) ) ) );

        order1.printOrder();
        System.out.println( "Total Price: " + order1.getOrderPrice() );
        System.out.println("Discounted Price: " + tenPercent.applyDiscount( order1.getOrderPrice() ) );

        System.out.println("\n==============================\n");

        System.out.println("Second Customer's Order: (5% Discount)");
        CustomerOrder order2 = new CustomerOrder();
        order2.addToOrder( new HotDog() );
        order2.addToOrder( new Ketchup( new Fries() ) );

        order2.printOrder();
        System.out.println( "Total Price: " + order2.getOrderPrice() );
        System.out.println("Discounted Price: " + fivePercent.applyDiscount( order2.getOrderPrice() ) );

        System.out.println("\n==============================\n");

        System.out.println("Third Customer's Order: (20% Discount)");
        CustomerOrder order3 = new CustomerOrder();
        order3.addToOrder( new Drink() );
        order3.addToOrder( new Pickles(  new Relish( new Ketchup( new Burger() ) ) ) );
        order3.addToOrder( new Mustard( new HotDog() ) );

        order3.printOrder();
        System.out.println( "Total Price: " + order3.getOrderPrice() );
        System.out.println("Discounted Price: " + twentyPercent.applyDiscount( order3.getOrderPrice() ) );

    }
}