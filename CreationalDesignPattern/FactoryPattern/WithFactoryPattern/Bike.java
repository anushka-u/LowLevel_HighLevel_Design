package FactoryPattern.WithFactoryPattern;

public class Bike implements Transport {
    @Override
    public void deliver() {
        System.out.println("Delivered by Bike");
    }
}
