package edu.sda.grcy.patterns.structual.decorator;

public class WinterPackage extends CarExtras {
    private boolean electricFrontWindow;
    private boolean heatedSeats;

    public WinterPackage(Car carToModify, boolean electricFrontWindow, boolean heatedSeats) {
        super(carToModify);
        this.electricFrontWindow = electricFrontWindow;
        this.heatedSeats = heatedSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding some features: ");
        System.out.println(electricFrontWindow ? " electric front window " : "");
        System.out.println(electricFrontWindow && heatedSeats ? ", " : "");
        System.out.println(heatedSeats ? " heated seats " : "");

        /**
         * tu jest jakiś warunek zwracający boolean
         * ?
         * to wykona się jeśli true
         * :
         * to wykona się jeśli false
         * /
         */
    }
}