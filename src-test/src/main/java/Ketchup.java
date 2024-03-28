public class Ketchup extends ToppingFoodDecorator {
    public Ketchup(Food decoratedFood){
        super(decoratedFood);
    }

    @Override
    public String makeFood(){
        return super.makeFood() + " with Ketchup";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
