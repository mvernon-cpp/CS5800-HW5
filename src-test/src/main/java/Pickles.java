public class Pickles extends ToppingFoodDecorator {
    public Pickles(Food decoratedFood){
        super(decoratedFood);
    }

    @Override
    public String makeFood(){
        return super.makeFood() + " with Pickles";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.75;
    }
}
