import java.util.ArrayList;

public class CustomerOrder {
    private ArrayList<Food> order = new ArrayList<>();

    public CustomerOrder(){}

    public ArrayList<Food> getOrder() { return order; }

    public void addToOrder(Food foodItem) {
        order.add(foodItem);
    }

    public double getOrderPrice() {
        double totalCost = 0.0;
        for (Food foodItem : order) {
            totalCost += foodItem.getPrice();
        }

        return totalCost;
    }

    public void printOrder() {
        for (Food foodItem : order ) {
            System.out.println(foodItem.makeFood() + "\t\t\t" + foodItem.getPrice() );
        }
    }
}
