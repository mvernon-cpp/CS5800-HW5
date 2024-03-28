public class Drink implements Food{
    @Override
    public String makeFood(){
        return "Drink";
    }

    @Override
    public double getPrice(){
        return 2.50;
    }
}
