package edu.sda.grcy.patterns.creational.singletons;

// idea Sinletona - za jego pomocą ustawiamy rzeczy wspólne dla całej aplikacji

public class Demo {
    public static void main(String[] args) {

        EagerSingleton eager1 = EagerSingleton.getInstance();
        // EagerSingleton eagerSingelton = new Eagersingleton; - nie zadziała bo mamy prywatny konstruktor

        EagerSingleton eager2 = EagerSingleton.getInstance();
        eager1.setSomeSettings("Coś ustawiamy");
        System.out.println("==========");
        System.out.println(eager2.getSomeSettings());

        System.out.println("==============");
        System.out.println("==============");

        LazySingleton lazy = LazySingleton.getInstance();
    }
}
