package edu.sda.grcy.patterns.structual.decorator;

import edu.sda.grcy.patterns.structual.facade.SportPackage;

public class DecoratorDemo {
    public static void main(String[] args) {
        Car basicCar = new BasicCar();
        basicCar.assemble();
        krecha();

        Car basicCar2 = new BasicCar();
        SportPackage sportCar = new SportPackage(basicCar2, true);
        sportCar.assemble();
        krecha();

        WinterPackage winterCar = new WinterPackage(new BasicCar(), false, true);
        winterCar.assemble();
        krecha();

        SportPackage sportWinterCar = new SportPackage(new WinterPackage
                (new BasicCar(), true, false),true);
        sportWinterCar.assemble();
    }

    public static void krecha(){
        System.out.println("==============================");
    }
}
