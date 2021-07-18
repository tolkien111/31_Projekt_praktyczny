package edu.sda.grcy.patterns.creational.singletons;

/**
 * Lazy bo nie inicjujemy obiektu od razu, czekamny na pierwsze "wołanie" o niego
 * UWAGA!!! To powoduje że LazySingleton nie powinien być stosowany w aplikacjach wielowątkowych
 * bo 2 wątki równocześnie mogłyby wywołać getInstance i stworzyć 2 obiekty klasy
 */

public class LazySingleton {

    /**
     * Mamy znowu prywatne pole statyczne, tym razem nie jest inicjalizowane od razu
     */

    private static LazySingleton INSTANCE;

    /**
     * Mamy znowu prywatny konstruktor, z zewnątrz nie ma dostępu
     */

    private LazySingleton(){
        System.out.println("Lazy Singleton initialisation");
    }

    /**
     * Mamy publiczną statyczną metodę zwracającą obiekt naszej klasy
     * Jeśli obiekt nie był dotychczas zainicjowany to przy
     * pierwszym wywołaniu metody getInstance sie to wykona
     */
    public static LazySingleton getInstance(){
        System.out.println("Lazy Singleton GetInstance");
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
