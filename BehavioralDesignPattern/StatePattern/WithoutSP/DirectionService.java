package StatePattern.WithoutSP;

public class DirectionService {
    public  TransportMode mode;

    public DirectionService(TransportMode mode)
    {
        this.mode = mode;
    }
    public int getETA() {
        switch (mode) {
            case WALKING:
                System.out.println("Calculating ETA for Walking");
                return 20;
            case CYCLING:
                System.out.println("Calculating ETA for Cycling");
                return 10;
            case CAR:
                System.out.println("Calculating ETA for CAR");
                return 5;
            case TRAIN:
                System.out.println("Calculating ETA for Train");
                return 0;
            default:
                System.out.println("Choose one of the provided mode for directions");
                return 0;
        }
    }

        public String getDirections(){
            switch(mode){
                case CYCLING :
                    return "Take a bicycle from closest Lane, Head east 60 meter. take a right and ride for another 800 meter" +
                        "You are at your destination";
                case WALKING :
                    return "Head towards north, take a left, walk straight 50 meter, turn right, You are at your destination";
                case CAR:
                    return "Take highway, Ride towards east for 900 meter, take left. You are at your destination";
                case TRAIN:
                    return "Train doesn't go for this destination";
                default:
                    return "Choose one of the provided mode for directions";
            }
        }
}
