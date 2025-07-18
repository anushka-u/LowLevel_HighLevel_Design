package ObserverPattern.WithoutOP;

public class WeatherStationMainWithoutOP {

    public static void main(String[] args) {

        /*Here we have tight coupling in between Weather Station and DisplayDevice
        //If you want to add more devive you will need to change the weather Station class
        which is not a good practice seeing how these classes are tightly couple violation one of the solid principle Dependency Injection
        The idea of DI is the high level module should not depend on low level module both should depend on abstractions and abstractions
         should not depend on details; details should depend on abstractions.
        */
        DisplayDevice displayDevice = new DisplayDevice();
        WeatherStation weatherStation = new WeatherStation(displayDevice);

        weatherStation.setTemprature(67.8f);
        weatherStation.setTemprature(56.9f);
    }
}
