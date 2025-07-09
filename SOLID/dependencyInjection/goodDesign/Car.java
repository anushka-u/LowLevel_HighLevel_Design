package dependencyInjection.goodDesign;

public class Car implements Engine{
    @Override
    public void start() {
        System.out.println("Car Engine started");
    }
}
