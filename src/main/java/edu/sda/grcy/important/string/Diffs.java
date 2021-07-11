package edu.sda.grcy.important.string;

public class Diffs {
    public static void main(String[] args) {

        /**
         * String - Klasa niemutowalna
         * Jak zmieniamy string na inny to tak na prawdę robimy nowy string
         * czyli
         * Strin napis1 = "aaa" - to 1 String
         * potem
         * napis1 = "BBB" - to kolejny String
         * !!! to że przypisaliśmy nową wartość to nie oznacza że stara nie zniknie z pamięci
         *
         * String ma własny obszar pamięci String Pool
         * tego obszaru nie dotyczy czyszczenie pamieci za pomocą Garbage Collectora
         */

        String napis1 = "aaa";
        napis1 = "aca";
        napis1 = "aab";
        napis1 = napis1 + "aaa";

        /**
         * Builder i Buffer są oparte na wzorcu Builder
         * String Buffer był wcześniej, od początku Javy (1.0)
         * StringBuilder powstał później
         *
         * String Builder jest szybszy ale nie zapewnia bezpieczeństwa w aplikacjach wielowątkowych
         *
         * String Buffer jest wolniejszy BO zapewnia bezpieczeństwo w wielowątkowości
         */

        StringBuilder napis2;

        StringBuffer napis3;
    }
}
