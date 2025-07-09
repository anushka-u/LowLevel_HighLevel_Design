package liskovSubstitution.goodDesign;

public class Crow implements Eater,Flyer{
    @Override
    public void eat() {
        System.out.println("Crow is eating...");
    }

    @Override
    public void fly() {
        System.out.println("Crow is Flying...");
    }
}
