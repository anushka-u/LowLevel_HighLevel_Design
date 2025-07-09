package dependencyInjection.badDesign;
/*
Car and Truck are inheriting from Engine, which means they are tightly coupled
to a concrete implementation not an abstraction
 */
public class ApplicationMain {

    public static void main(String[] args) {
        Car car = new Car();
        car.start();

        Truck truck = new Truck();
        truck.start();
    }
}
