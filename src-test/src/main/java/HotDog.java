public class HotDog implements Food{
    @Override
    public String makeFood(){
        return "Hot Dog";
    }

    @Override
    public double getPrice() {
        return 3.00;
    }
}
