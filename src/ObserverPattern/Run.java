package ObserverPattern;

public class Run {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Kerim Senturk");
        Observable observable = new SimpleObservable(bankAccount);
        Observer observer = new SimpleObserver();
        observable.subscribe(observer);

        bankAccount.setBalance(23.4);
        bankAccount.setOwner("Gang of four");

        observable.setState(bankAccount);

        bankAccount.setBalance(98.45);
        bankAccount.setOwner("Bill Joy");

        observable.setState(bankAccount);

        System.out.println(observer.getState());
    }
}
