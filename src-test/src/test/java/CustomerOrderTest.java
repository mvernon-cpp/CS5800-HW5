import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static java.util.Arrays.asList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerOrderTest {
    CustomerOrder customerOrder = new CustomerOrder();
    @Test
    public void testCustomerOrder() {
        customerOrder.addToOrder( new Burger() );
        customerOrder.addToOrder( new HotDog() );
        customerOrder.addToOrder( new Fries() );
        customerOrder.addToOrder( new Drink() );

        ArrayList<Food> expected = customerOrder.getOrder();
//        ArrayList<Food> actual = (ArrayList<Food>) asList( new Burger(), new HotDog(), new Fries(), new Drink() );
        assertEquals( expected.get(0).makeFood(), new Burger().makeFood() );
        assertEquals( expected.get(1).makeFood(), new HotDog().makeFood() );
        assertEquals( expected.get(2).makeFood(), new Fries().makeFood() );
        assertEquals( expected.get(3).makeFood(), new Drink().makeFood() );
    }

    @Test
    public void testCustomerOrderPrice() {
        customerOrder.addToOrder(new Ketchup(new Fries()));
        customerOrder.addToOrder(new Drink());

        double expected = customerOrder.getOrderPrice();
        double actual = 6.00;
        assertEquals(expected, actual);
    }
}
