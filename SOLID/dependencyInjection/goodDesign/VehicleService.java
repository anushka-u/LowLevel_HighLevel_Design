package dependencyInjection.goodDesign;

public class VehicleService {

    private final Engine engine;


    public VehicleService(Engine engine) {
        this.engine = engine;
    }

    public void setEngine(){
        this.engine.start();
    }
}
