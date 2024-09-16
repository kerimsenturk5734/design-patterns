package ObserverPattern;

public interface Observer{
    Object getState();
    void update(Observable observable);
}