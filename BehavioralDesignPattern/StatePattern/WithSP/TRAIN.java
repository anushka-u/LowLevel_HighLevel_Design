package StatePattern.WithSP;

public class TRAIN implements TransportMode{
    @Override
    public int getETA() {
        System.out.println("Calculating ETA for Train");
        return 0;
    }

    @Override
    public String getDirection() {
        return "Train doesn't go for this destination";
    }
}
