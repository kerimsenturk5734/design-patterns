package Singleton;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE=new EagerSingleton();

    private EagerSingleton(){
        singletonTest();
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

    public void singletonTest(){
        System.out.println("Eager Singleton Test Mesajı");
    }
}
