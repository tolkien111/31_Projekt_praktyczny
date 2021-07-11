package edu.sda.grcy.patterns.behavioral.templateMethod;

public abstract class NewsProvider {
    private String message;

    public NewsProvider(String message) {
        this.message = message;
    }

    // deklarujemy metodę która będzie w innych klasach rozwijana/nadpisywana
    public abstract boolean authorize();

    // finalna czyli niezmienialna/niemodyfikowalna
    public final boolean sendMessage() {
        System.out.println(" Message sent : " + message);
        return true;
    }

    // metoda opcjonalnie do nadpisania, zależnie od ustawienia kanału komunikacji
    public boolean endConnection() {
        System.out.println("Generic end connection");
        return true;
    }

    // metoda przechowująca algorytm, nie można nadpisać
    public final void provideNews() {
        if (authorize()) {
            sendMessage();
            endConnection();
        } else {
            System.out.println(" Can't send to unauthorized");
        }
    }
}
