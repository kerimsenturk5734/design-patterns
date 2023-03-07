package Singleton;

public class BillPughSingleton {
    private BillPughSingleton(){
        singletonTest();
    }

    public static BillPughSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    public void singletonTest(){
        System.out.println("BillPugh Singleton Test Mesajı");
    }
    private static class SingletonHelper{
        private static final BillPughSingleton INSTANCE=new BillPughSingleton();
    }
}
