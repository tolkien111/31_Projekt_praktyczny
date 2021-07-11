package edu.sda.grcy.patterns.behavioral.strategy;

public class Travel {
    private String startAt;
    private String destination;
    private String travelPlan;

    public Travel(String startAt, String destination) {
        this.startAt = startAt;
        this.destination = destination;
    }

    public void calculateTravelPlan (TravelStrategy strategy) {
        travelPlan = strategy.setTravelPlan(startAt, destination);
    }
    public void getTravelInfo(){
        System.out.println("Travel from " + startAt + " to " + destination);
        System.out.println("===== DETAILS =====");
        System.out.println(travelPlan);
        System.out.println("===================");
    }
}
