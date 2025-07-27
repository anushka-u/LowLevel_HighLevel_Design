package FactoryPattern.WithoutFactoryPattern;

public class TransportService {

    public static void main(String[] args) {

        Transport car = new Car();

        Transport bike = new Bike();

        Transport bus = new Bus();

        car.deliver();
        bike.deliver();
        bus.deliver();
    }
}
