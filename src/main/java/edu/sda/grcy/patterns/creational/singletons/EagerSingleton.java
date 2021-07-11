package edu.sda.grcy.patterns.creational.singletons;

/**
 * Eager czyli "od razu", w naszym przykładzie oznacza to że obiekt INSTANCE
 * jest tworzony od razu w momencie kompilacji / uruchamiania klasy JVM
 */

public class EagerSingleton {

    /**
     * 1. Mamy prywatne statyczne pole będące obiektem naszej klasy
     * - prywatne więc nie mamy do niego dostępu z zewnątrz (a w każdym razie nie tak łatwo)
     * - statyczne więc obiekt wspólny dla klasy
     */

    public static final EagerSingleton INSTANCE = new EagerSingleton();

    private String someSettings;

    /**
     * Prywatny konstruktor więc też nie wywołamy go z zewnątrz (a w każdym razie nie tak łatwo -> reflekcje)
     */


    private EagerSingleton() {
        System.out.println("Eager sinleton initialisation");
    }

    /**
     *
     * publiczna statyczna metoda zwracająca istniejący obiekt
     */

    public static EagerSingleton getInstance() {
        System.out.println("Method getInstance");
        return INSTANCE;
    }

    public String getSomeSettings() {
        return someSettings;
    }

    public void setSomeSettings(String someSettings) {
        this.someSettings = someSettings;
    }
}
