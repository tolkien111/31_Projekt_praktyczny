package edu.sda.grcy.patterns.behavioral.strategy;

public class WalkStrategy implements TravelStrategy {

    private boolean includeTouristicPaths;

    public WalkStrategy(boolean includeTouristicPaths) {
        this.includeTouristicPaths = includeTouristicPaths;
    }

    @Override
    public String setTravelPlan(String from, String to) {
        return new StringBuilder("Travel by FOOT from ")
                .append(from)
                .append(" to ")
                .append(to)
                .append(includeTouristicPaths ? " including touristic paths " : "")
                .toString(); // raczej zwracamy obiekt bez nazwy i nie robimy obiektu cześniej z uwagi na Garbage collector
                            // w dyżych obiektach, żeby wiedzieć co się dziele lepiej stosować nowy obiekt z nazwą
    }
}
