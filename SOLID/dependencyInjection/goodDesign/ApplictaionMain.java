package dependencyInjection.goodDesign;

public class ApplictaionMain {

    public static void main(String[] args) {
        Engine engine = new Car();
        VehicleService vs = new VehicleService(engine);
        vs.setEngine();

        Engine engine1 = new Truck();
        VehicleService vs2 = new VehicleService(engine1);
        vs2.setEngine();
    }
}
