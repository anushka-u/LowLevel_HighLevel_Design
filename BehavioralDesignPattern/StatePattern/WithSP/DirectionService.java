package StatePattern.WithSP;

public class DirectionService implements TransportMode {

    public TransportMode mode;

    public DirectionService(TransportMode mode)
    {
        this.mode = mode;
    }

    public void setMode(TransportMode mode ){
        this.mode = mode;
    }

    @Override
    public int getETA() {
        return mode.getETA();
    }

    @Override
    public String getDirection() {
        return mode.getDirection();
    }
}
