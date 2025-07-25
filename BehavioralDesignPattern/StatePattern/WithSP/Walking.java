package StatePattern.WithSP;

public class Walking implements TransportMode{
    @Override
    public int getETA() {
        System.out.println("Calculating ETA for Walking");
        return 20;
    }

    @Override
    public String getDirection() {
        return "Head towards north, take a left, walk straight 50 meter, turn right, You are at your destination";
    }
}
