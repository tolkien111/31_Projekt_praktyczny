package edu.sda.grcy.patterns.structual.decorator;

public abstract class CarExtras implements Car {
    protected Car carToModify;

    public CarExtras(Car carToModify) {
        this.carToModify = carToModify;
    }

    @Override
    public void assemble() {
        System.out.println("Assembling some extra features");
        this.carToModify.assemble();
    }
}
