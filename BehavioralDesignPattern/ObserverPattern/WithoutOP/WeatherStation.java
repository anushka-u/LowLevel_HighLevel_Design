package ObserverPattern.WithoutOP;

import java.awt.*;

public class WeatherStation {
    private float temprature;
    private DisplayDevice displayDevice;

    public WeatherStation(DisplayDevice displayDevice)
    {
        this.displayDevice =displayDevice;
    }
    public void setTemprature(float temp)
    {
        this.temprature = temp;
    }

    public void notifyDevice(){
        displayDevice.showTemp(temprature);
    }

}
