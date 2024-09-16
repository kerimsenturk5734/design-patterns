package ObserverPattern;

public class SimpleObserver implements Observer{
    private Object state;

    public SimpleObserver(){

    };
    public SimpleObserver(Object initialState){
        this.state = initialState;
    }
    @Override
    public Object getState() {
        return this.state;
    }

    private void setState(Object state){
        this.state = state;
    }

    @Override
    public void update(Observable observable) {
        setState(observable.getState());
        System.out.println("State updated with value -> " + observable.getState());
    }
}
