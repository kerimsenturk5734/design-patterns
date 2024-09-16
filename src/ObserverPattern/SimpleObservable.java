package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class SimpleObservable implements Observable{
    private Object state;
    private final List<Observer> observerList;

    public SimpleObservable(Object initialState){
        this.state = initialState;
        this.observerList = new ArrayList<>();
    }
    @Override
    public List<Observer> getObservers() {
        return this.observerList;
    }

    @Override
    public Object getState() {
        return this.state;
    }

    @Override
    public void setState(Object state) {
        this.state = state;
        notifyObservers();
    }
}
