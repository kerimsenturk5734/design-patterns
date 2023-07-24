package Decorator;

public class Notifier {

    public void send(String message){
        System.out.println("Mesaj gönderildi: " + message);
    }
}

enum NOTIFIER_TYPE {
    SMS_NOTIFIER,
    FACEBOOK_NOTIFIER,
    INSTAGRAM_NOTIFIER
}