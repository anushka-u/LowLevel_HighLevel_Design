package StatePattern.WithSP;

public class ClientSP {

    public static void main(String[] args) {
        DirectionService directionService = new DirectionService(new Walking());
        System.out.println(directionService.getETA());
        System.out.println(directionService.getDirection());

        directionService.setMode(new TRAIN());
        System.out.println(directionService.getDirection());
        directionService.getETA();
    }
}
