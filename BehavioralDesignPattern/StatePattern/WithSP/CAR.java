package StatePattern.WithSP;

public class CAR implements TransportMode{
    @Override
    public int getETA() {
        System.out.println("Calculating ETA for CAR");
        return 5;
    }

    @Override
    public String getDirection() {
        return "Take highway, Ride towards east for 900 meter, take left. You are at your destination";
    }
}
