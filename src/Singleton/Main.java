package Singleton;

import Singleton.*;

public class Main {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1=EagerSingleton.getInstance();

        if(eagerSingleton1.hashCode()==eagerSingleton.hashCode())
            System.out.println("EagerSingleton'lar aynı nesnedir!!!");

        StaticBlockSingleton staticBlockSingleton=StaticBlockSingleton.getInstance();

        LazySingleton lazySingleton=LazySingleton.getInstance();
        LazySingleton lazySingleton1=LazySingleton.getInstance();//Lazy singleton daha önceden bir kere olusturuldugu için mesaj dönmez

        ThreadSafeSingleton threadSafeSingleton=ThreadSafeSingleton.getInstance();

        BillPughSingleton billPughSingleton=BillPughSingleton.getInstance();
        BillPughSingleton billPughSingleton1=BillPughSingleton.getInstance();//Mesaj dönmez


    }
}