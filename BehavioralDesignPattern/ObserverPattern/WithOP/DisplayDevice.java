package ObserverPattern.WithOP;

public class DisplayDevice implements  Observer{

    private String deviceName;

    public DisplayDevice(String deviceName)
    {
        this.deviceName = deviceName;
    }
    @Override
    public void update(float temp) {
        System.out.println("Temprature on Display device " + deviceName + " is "+ temp);
    }
}
