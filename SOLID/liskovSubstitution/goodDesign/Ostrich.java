package liskovSubstitution.goodDesign;

public class Ostrich implements Eater {
    @Override
    public void eat() {
        System.out.println("Ostrich  only eats...");
    }
}
