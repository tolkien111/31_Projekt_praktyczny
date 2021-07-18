package edu.sda.grcy.patterns.structual.decorator;

public class SportPackage extends CarExtras {
    private boolean sportWheel;
    private boolean sportSeats;

    public SportPackage(Car carToModify, boolean sportSeats) {
        super(carToModify);
        this.sportSeats = sportSeats;
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding sporty features: ");
        System.out.println("Adding sport seats: ");
        addSportWheel();
    }

    private void addSportWheel() {
        sportWheel = true;
        System.out.println("Adding sport wheel\n");
    }
}
