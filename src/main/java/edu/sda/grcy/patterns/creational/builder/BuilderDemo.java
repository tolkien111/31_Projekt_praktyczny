package edu.sda.grcy.patterns.creational.builder;

import java.util.List;

public class BuilderDemo {
    public static void main(String[] args) {

        House smallHouse = new House.HouseBuilder("Bloczki", "Ytong", "Blacha")
                //przed wywołaniem metody build() mamy obiekt klasy HouseBuilder
                .build();

        House houseWithGarage = new House.HouseBuilder("Wylewany", "Max", "Dachówka")
                .withGarage("W bryle budynku")
                .build();

        House houseWithGarden = new House.HouseBuilder("Bloczki", "Cegła", "Papodachówka")
                .withGarden("Ogród z oczkiem wodnym").build();

        House residence = new House.HouseBuilder("Bloczki", "Max", "Blachodachówka")
                .withGarage("Osobny, 2-stanowiskowy")
                .withGarden("Ogród z basenem")
                .build();

        List<House> houses = List.of(smallHouse,houseWithGarage,houseWithGarden,residence);
        System.out.println("Podsumowanie:");
        houses.forEach(x -> System.out.println(x.getHouseInfo()));
    }
}
