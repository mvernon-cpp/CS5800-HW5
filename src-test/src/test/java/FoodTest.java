import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FoodTest {
    Food burger = new Burger();
    Food hotDog = new HotDog();
    Food fries = new Fries();
    Food drink = new Drink();

    @Test
    public void testBurger() {
        String expected = "Burger";
        String actual = burger.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testBurgerPrice() {
        double expected = 5.00;
        double actual = burger.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void testHotDog() {
        String expected = "Hot Dog";
        String actual = hotDog.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testHotDogPrice() {
        double expected = 3.00;
        double actual = hotDog.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void testFries() {
        String expected = "Fries";
        String actual = fries.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testFriesPrice() {
        double expected = 3.00;
        double actual = fries.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void testDrink() {
        String expected = "Drink";
        String actual = drink.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testDrinkPrice() {
        double expected = 2.50;
        double actual = drink.getPrice();
        assertEquals(expected, actual);
    }
}
