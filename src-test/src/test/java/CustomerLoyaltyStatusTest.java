import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerLoyaltyStatusTest {
    CustomerLoyaltyStatus customerLoyaltyStatus = new CustomerLoyaltyStatus(0.1);

    CustomerOrder customerOrder = new CustomerOrder();


    @Test
    public void testCustomerLoyaltyStatus() {
        customerOrder.addToOrder(new Ketchup(new Fries()));
        customerOrder.addToOrder(new Drink());

        double expected = customerLoyaltyStatus.applyDiscount( customerOrder.getOrderPrice() );
        double actual = 5.4;
        assertEquals(expected, actual);
    }

}
