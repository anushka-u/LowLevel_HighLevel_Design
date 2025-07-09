package dependencyInjection.badDesign;

public class Truck extends Car{

    @Override
    public void start(){
        System.out.println("Truck Engine started");
    }
}
