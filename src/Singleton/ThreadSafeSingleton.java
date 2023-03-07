package Singleton;

public class ThreadSafeSingleton {
    private static ThreadSafeSingleton threadSafeSingleton;

    private ThreadSafeSingleton(){
        singletonTest();
    }

    //synchronized keyword'u sayesinde bir thread erişirken diğerinin erişmesini engeller.
    public static synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton ==null)
            threadSafeSingleton =new ThreadSafeSingleton();

        return threadSafeSingleton;
    }

    public void singletonTest(){
        System.out.println("Thread Safe Singleton Test Mesajı");
    }
}
