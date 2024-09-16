package ObserverPattern;

import java.util.List;

public interface Observable{
    List<Observer> getObservers();
    Object getState();
    void setState(Object state);
    default void subscribe(Observer observer){
        getObservers().add(observer);
    }
    default void unsubscribe(Observer observer){
        getObservers().remove(observer);
    }
    default void notifyObservers(){
        getObservers().forEach(o -> o.update(this));
    }
}
