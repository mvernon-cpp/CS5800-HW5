public class Relish extends ToppingFoodDecorator {
    public Relish(Food decoratedFood){
        super(decoratedFood);
    }

    @Override
    public String makeFood(){
        return super.makeFood() + " with Relish";
    }

    @Override
    public double getPrice() {
        return super.getPrice() + 0.5;
    }
}
