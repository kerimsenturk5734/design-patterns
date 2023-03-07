package Singleton;

public class StaticBlockSingleton {
    private static StaticBlockSingleton INSTANCE;

    private StaticBlockSingleton(){
        singletonTest();
    }

    static {
        INSTANCE=new StaticBlockSingleton();
    }

    public static StaticBlockSingleton getInstance(){
        return INSTANCE;
    }
    public void singletonTest(){
        System.out.println("Static Singleton Test Mesajı");
    }

}
