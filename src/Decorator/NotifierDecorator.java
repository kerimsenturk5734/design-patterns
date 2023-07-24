package Decorator;

public class NotifierDecorator extends Notifier{
    private Notifier wrapper;


    public NotifierDecorator(Notifier notifier){
        wrapper = notifier;
    }

    @Override
    public void send(String message) {
        wrapper.send(message);
    }
}
