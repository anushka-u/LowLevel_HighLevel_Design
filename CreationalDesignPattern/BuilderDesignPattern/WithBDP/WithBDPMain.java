package BuilderDesignPattern.WithBDP;

public class WithBDPMain {

    public static void main(String[] args) {
        House house = new House.HouseBuilder("Concrete","Wooden","Sps")
                .setGarage(true)
                .setGarden(false)
                .setSwimmingPool(true).build();

        System.out.println(house);
    }
}
