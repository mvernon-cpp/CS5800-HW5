import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class ToppingTest {
    Food burger = new Burger();

    Food ketchup = new Ketchup( burger );
    Food mustard = new Mustard( burger );
    Food relish = new Relish( burger );
    Food pickles = new Pickles( burger );

    @Test
    public void testKetchup() {
        String expected = "Burger with Ketchup";
        String actual = ketchup.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testKetchupPrice() {
        double expected = 5.50;
        double actual = ketchup.getPrice();
        assertEquals(expected, actual);
    }


    @Test
    public void testMustard() {
        String expected = "Burger with Mustard";
        String actual = mustard.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testMustardPrice() {
        double expected = 5.50;
        double actual = mustard.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void testRelish() {
        String expected = "Burger with Relish";
        String actual = relish.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testRelishPrice() {
        double expected = 5.50;
        double actual = relish.getPrice();
        assertEquals(expected, actual);
    }
    @Test
    public void testPickles() {
        String expected = "Burger with Pickles";
        String actual = pickles.makeFood();
        assertEquals(expected, actual);
    }

    @Test
    public void testPicklesPrice() {
        double expected = 5.75;
        double actual = pickles.getPrice();
        assertEquals(expected, actual);
    }
}
