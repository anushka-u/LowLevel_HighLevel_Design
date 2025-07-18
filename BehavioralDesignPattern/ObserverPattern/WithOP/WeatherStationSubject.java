package ObserverPattern.WithOP;

import ObserverPattern.WithoutOP.WeatherStation;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationSubject implements Subject{

    private float temprature;
    private List<Observer> observerList;

      public WeatherStationSubject(){
        observerList = new ArrayList<>();
    }
    @Override
    public void attach(Observer obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(Observer obs) {
          observerList.remove(obs);
    }

    @Override
    public void notifyObserver() {
          for(Observer obs : observerList)
          {
              obs.update(temprature); //Run time polymorphism
          }
    }

    public void setTemprature(float temp)
    {
        this.temprature = temp;
    }
}
