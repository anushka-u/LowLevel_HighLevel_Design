package ObserverPattern.WithOP;

public class WeatherStationMain {

    public static void main(String[] args) {
        //Create a publisher
        WeatherStationSubject  weatherStationSubject =  new WeatherStationSubject();
        //Create subscriber
        DisplayDevice displayDevice = new DisplayDevice("SamsungLCD");
        weatherStationSubject.attach(displayDevice);

        MobileDevice mobileDevice =  new MobileDevice("Android");
        weatherStationSubject.attach(mobileDevice);

        weatherStationSubject.setTemprature(98.7f);
        weatherStationSubject.notifyObserver();

    }
}
