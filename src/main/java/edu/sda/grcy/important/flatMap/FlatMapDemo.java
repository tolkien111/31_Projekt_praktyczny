package edu.sda.grcy.important.flatMap;

import java.util.List;
import java.util.Set;

public class FlatMapDemo {
    public static void main(String[] args) {

        Pesel pesel1 = new Pesel("12345");
        Pesel pesel2 = new Pesel("23244");
        Pesel pesel3 = new Pesel("12221");
        Pesel pesel4 = new Pesel("55555");
        Pesel pesel5 = new Pesel("72355");
        Pesel pesel6 = new Pesel("34567");
        Pesel pesel7 = new Pesel("56783");
        Pesel pesel8 = new Pesel("36583");
        Pesel pesel9 = new Pesel("67889");


        List<Pesel> peselList = List.of(pesel1, pesel2, pesel3, pesel4, pesel5);

        Set<Pesel> peselSet = Set.of(pesel6, pesel7, pesel8, pesel9);

        /**
         * Drukujemy wszystki pesele po kolei
         */
        System.out.println("LISTA:");
        peselList.stream()
                .map(Pesel::getPeselNumber)
                .forEach(System.out::println);

        System.out.println("SET:");
        peselSet.stream()
                .map(Pesel::getPeselNumber)
                .forEach(System.out::println);

        System.out.println("===============");
        System.out.println("CALOSC:");
        List.of(peselList, peselSet).stream()
                .flatMap(x -> x.stream())// flatmap pozwoli man ma wyekstrachowanie elementów z np. z 2 innych kolekcji, a nie utworzy listę 2 elementów z podanych kolekcji
                .map(Pesel::getPeselNumber) //
                .forEach(System.out::println);
    }
}
