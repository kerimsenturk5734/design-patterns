package Decorator;

public class Run {
    public static void main(String[] args) {

        Notifier notifier = new Notifier();

        notifier = new SMSDecorator(notifier);
        notifier = new FacebookDecorator(notifier);
        notifier = new InstagramDecorator(notifier);

        notifier.send("Hello World");

    }
}
