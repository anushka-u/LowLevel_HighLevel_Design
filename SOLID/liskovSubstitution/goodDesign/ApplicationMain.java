package liskovSubstitution.goodDesign;

public class ApplicationMain {
/*In this example we are fixing LSP by not substituting a flyer with a non-flyer
We're applying ISP too by not forcing ostrich to implement fly().
*/
    public static void main(String[] args) {

        Eater eater = new Crow();
        eater.eat();

        Flyer flyer = new Crow();
        flyer.fly();

        Eater eater1 = new Ostrich();
        eater1.eat();
    }
}
