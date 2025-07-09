package dependencyInjection.badDesign;

public class Car extends Engine{
    @Override
    public void start(){
        System.out.println("Car Engine started");
    }
}
