public abstract class ToppingFoodDecorator implements Food{
    protected Food decoratedFood;

    public ToppingFoodDecorator(Food decoratedFood ) {
        this.decoratedFood = decoratedFood;
    }

    @Override
    public String makeFood() {
        return decoratedFood.makeFood();
    }

    @Override
    public double getPrice(){
        return decoratedFood.getPrice();
    }
}
