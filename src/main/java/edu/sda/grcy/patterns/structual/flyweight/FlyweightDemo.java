package edu.sda.grcy.patterns.structual.flyweight;

import java.util.Arrays;
import java.util.List;

public class FlyweightDemo {
    public static void main(String[] args) {
        FordMustang mustang1 = new FordMustang("Midnight Sky", "4.0", "Denon");
        FordMustang mustang2 = new FordMustang("Ruby Red", "4.0", "Sony");
        FordMustang mustang3 = new FordMustang("Black Panther", "2.5 EcoBoost", "Denon");
        FordMustang mustang4 = new FordMustang("Midnight Sky", "2.5 EcoBoost", "Sony");
        FordMustang mustang5 = new FordMustang("Midnight Sky", "4.0", "Sony");
        FordMustang mustang6 = new FordMustang("Ruby Red", "4.0", "Denon");

        List<FordMustang> mustangs = Arrays.asList(mustang1, mustang2, mustang3, mustang4, mustang5, mustang6);
        System.out.println("Listujemy samochody");
        mustangs.stream()
                .map(FordMustang::retriveCarInfo)
                .forEach(System.out::println);
        System.out.println("+++++++++++++++++");
        System.out.println("A teraz wypisujemy BASE:");
        System.out.println("+++++++++++++++++");
        MustangBaseFactory.getFordMustangBaseSet()
                .stream()
                .map(FordMustangBase::baseInfo)
                .forEach(System.out::println);
    }
}
