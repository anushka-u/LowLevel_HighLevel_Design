package ObserverPattern.WithOP;

/*
We can also make this as an abstract class, but we are making it as interface
so that the concrete subject can extend from other parent class as well, if needed.
 */
public interface Subject {

    void attach(Observer obs);
    void detach(Observer obs);
    void notifyObserver();
}
