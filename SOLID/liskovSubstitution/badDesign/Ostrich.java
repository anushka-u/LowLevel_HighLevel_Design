package liskovSubstitution.badDesign;

public class Ostrich extends Bird{

    @Override
    public void eat(){
        System.out.println("Ostrich eatingg....");
    }

    @Override
    public void fly(){
        throw new RuntimeException("Ostrich doesn't fly");
    }


}
