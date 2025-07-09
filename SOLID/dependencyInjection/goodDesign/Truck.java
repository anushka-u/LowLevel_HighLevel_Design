package dependencyInjection.goodDesign;

public class Truck implements Engine {
    @Override
    public void start() {
        System.out.println("Truck Engine Started");
    }
}
