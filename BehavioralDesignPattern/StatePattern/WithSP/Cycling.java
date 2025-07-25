package StatePattern.WithSP;

public class Cycling implements TransportMode{
    @Override
    public int getETA() {
        System.out.println("Calculating ETA for Cycling");
        return 10;
    }

    @Override
    public String getDirection() {
        return "Take a bicycle from closest Lane, Head east 60 meter. take a right and ride for another 800 meter" +
                "You are at your destination";
    }
}
