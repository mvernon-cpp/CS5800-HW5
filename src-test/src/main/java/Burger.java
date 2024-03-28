public class Burger implements Food{
    @Override
    public String makeFood(){
        return "Burger";
    }

    @Override
    public double getPrice(){
        return 5.00;
    }
}
