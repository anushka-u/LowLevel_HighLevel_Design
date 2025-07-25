package StatePattern.WithoutSP;

public class Client {

    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(TransportMode.WALKING);
        directionService.getETA();
        directionService.getDirections();
    }
}
