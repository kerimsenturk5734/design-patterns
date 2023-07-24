package Decorator;

public class InstagramDecorator extends NotifierDecorator {
    public InstagramDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message);
        sendInstagram(message);
    }

    private void sendInstagram(String message){
        System.out.println("Instagram mesajı gönderildi: " + message);
    }
}
