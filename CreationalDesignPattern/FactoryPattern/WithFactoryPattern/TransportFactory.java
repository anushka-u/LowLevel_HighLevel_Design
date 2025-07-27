package FactoryPattern.WithFactoryPattern;

public class TransportFactory {

//    public String type;
//
//    public TransportFactory(String type){
//        this.type = type;
//    }

    public static Transport createTransport(String type){
        switch (type) {
            case "Car":
                return new Car();
            case "Bus":
                return new Bus();
            case "Bike":
                return new Bike();
            default:
                throw new IllegalArgumentException("The " + type + " isn't available for Transport");
        }
    }
}
