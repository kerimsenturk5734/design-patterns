package Decorator;

public class FacebookDecorator extends NotifierDecorator {
    public FacebookDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendFacebook(message);
    }

    private void sendFacebook(String message){
        System.out.println("Facebook mesajı gönderildi: " + message);
    }
}
