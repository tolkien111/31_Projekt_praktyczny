package edu.sda.grcy.patterns.creational.factory;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /**
         * Klasyczne powoływanie obiektów
         *
         * Problem jest taki że operator "new" nie powinien być nadużywany
         * i nie powinien być używany przez wszystkich bo tak pasuje, bo trzeba nowy
         * obiekt, powinniśmy go schować tak żeby nie używał go każdy i zawsze.
         * Notmalny użytkownik powinien raczej używać metod dedykowanych do utworzenia obiektu.
         */
        MacBook air1 = new MacBookAir("8G", "128G", 13);
        MacBook pro1 = new MacBookPro("16G", "256G", 16);


        /**
         * Fabryka
         * Dostaje zamówienie na macBooka
         * Z punktu widzenia zamawiającego nie ma znaczenia czy on dostanie nowy obiekt
         * czy już istniejący, ważne że ma go dostać
         *
         * zaleta - przerzucamy odpowiedzialność na inna klasę odnośnie tworzenia obiektów
         * i dzięki temu jeżeli nam się coś krzaczy przy tworzeniu idziemy do jednego miejsca w kodzie
         * a nie kilku miejsc gdzie jest tworzony obiekt przez "new"
         */

        MacBook air2 = MacBookFactory.getMac("Air","8G", "256G", 13);
        MacBook pro2 = MacBookFactory.getMac("Pro","8G", "256G", 13);
        MacBook pro3 = MacBookFactory.getMac("Pro","16G", "512G", 13);
        MacBook pro4 = MacBookFactory.getMac("Pro","32G", "512G", 16);
        MacBook pro5 = MacBookFactory.getMac("AIRS","32G", "512G", 16);

        List <MacBook> macBookList = List.of(air1, pro1, air2, pro2,pro3, pro4);

    }
}
