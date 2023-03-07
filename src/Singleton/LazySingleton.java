package Singleton;

public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton(){
        singletonTest();
    }

    public static LazySingleton getInstance(){
        if(lazySingleton==null)
            lazySingleton=new LazySingleton();

        return lazySingleton;
    }

    public void singletonTest(){
        System.out.println("Lazy Singleton Test Mesajı");
    }
}
