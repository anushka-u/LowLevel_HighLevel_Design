package FactoryPattern.WithoutFactoryPattern;

public class Car implements Transport{
    @Override
    public void deliver() {
        System.out.println("Delivered by Car");
    }
}
