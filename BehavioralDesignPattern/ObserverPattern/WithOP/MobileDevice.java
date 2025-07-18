package ObserverPattern.WithOP;

public class MobileDevice implements Observer{

    private String name;

    public MobileDevice(String name)
    {
        this.name = name;
    }
    @Override
    public void update(float temp) {
        System.out.println("Temprature on Mobile Device " + name +" is" + temp);
    }
}
