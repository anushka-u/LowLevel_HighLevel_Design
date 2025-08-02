package BuilderDesignPattern.WithoutBDP;

public class WBPMain {

    public static void main(String[] args) {
        House house = new House("Concrete","Wood","Shingles",true,true);
        //Constructor Explosion -> Too Many Constructor
        //Difficult to understand and maintain this code
        //this is where builder pattern comes into picture.
        System.out.println(house);
    }
}
