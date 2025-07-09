package liskovSubstitution.badDesign;

public class Crow extends Bird{

    @Override
    public void eat(){
        System.out.println("Crow is eating");
    }

    @Override
    public void fly(){
        System.out.println("I am a Crow and I fly");
    }
}
