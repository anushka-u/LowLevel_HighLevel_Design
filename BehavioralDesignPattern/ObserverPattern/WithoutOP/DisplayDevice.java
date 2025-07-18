package ObserverPattern.WithoutOP;

import com.sun.security.jgss.GSSUtil;

public class DisplayDevice {

    public  void showTemp(float temp)
    {
        System.out.println("current temprature "+ temp + "C");
    }
}
