public class Mustard extends ToppingFoodDecorator {
    public Mustard(Food decoratedFood){
        super(decoratedFood);
    }

    @Override
    public String makeFood(){
        return super.makeFood() + " with Mustard";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
