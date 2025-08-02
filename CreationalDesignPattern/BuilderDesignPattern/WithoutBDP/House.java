package BuilderDesignPattern.WithoutBDP;

public class House {

    private String foundation;
    private String structure;
    private String roof;
    private boolean hasGarage;
    private boolean hasSwimmingPool;
    private boolean hasGarden;

    //Two constructors must be differ in number of parameters or type of parameters
    //If we have N variables and we start creating constructors, we will end up creating n+! constructors


    public House(String foundation, String structure, String roof, boolean hasGarage,
                  boolean hasGarden){
        this.foundation = foundation;
        this.structure =structure;
        this.roof = roof;
        this.hasGarage = hasGarage;
        this.hasSwimmingPool = false;
        this.hasGarden= hasGarden;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", hasGarage=" + hasGarage +
                ", hasSwimmingPool=" + hasSwimmingPool +
                ", hasGarden=" + hasGarden +
                '}';
    }
}
