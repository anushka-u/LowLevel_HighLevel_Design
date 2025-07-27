package FactoryPattern.WithFactoryPattern;

public class TransportService {

    public static void main(String[] args) {

        Transport vehicle = TransportFactory.createTransport("Car");
        vehicle.deliver();
    }

}
