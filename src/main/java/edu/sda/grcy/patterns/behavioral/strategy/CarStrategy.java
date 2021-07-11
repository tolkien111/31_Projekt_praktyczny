package edu.sda.grcy.patterns.behavioral.strategy;

public class CarStrategy implements TravelStrategy{
    private boolean includePaidMotorways;
    private boolean includeFieldRoads;

    public CarStrategy(boolean includePaidMotorways, boolean includeFieldRoads) {
        this.includePaidMotorways = includePaidMotorways;
        this.includeFieldRoads = includeFieldRoads;
    }

    @Override
    public String setTravelPlan(String from, String to) {
        return new StringBuilder("Travel by CAR from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includePaidMotorways ? " including paid Motorways " : "") //: wykona się jak includePaidMotorways będzie true, jeżeli nie to ""
                .append(includeFieldRoads ? " including field roads " : "")
                .toString();
    }
}
