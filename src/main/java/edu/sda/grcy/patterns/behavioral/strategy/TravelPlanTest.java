package edu.sda.grcy.patterns.behavioral.strategy;

public class TravelPlanTest {
    public static void main(String[] args) {
        Travel travel = new Travel("Rzeszów", "Bieszczedy");

        travel.calculateTravelPlan(new WalkStrategy(true));
        travel.getTravelInfo();
        krecha();
        travel.calculateTravelPlan(new CarStrategy(false, true));
        travel.getTravelInfo();
        krecha();
        krecha();
        travel = new Travel("Rzeszów", "Kolonia");
        travel.calculateTravelPlan(new CarStrategy(true, false));
        travel.getTravelInfo();

    }
         private static void krecha(){
            System.out.println("==========================================");

    }
}
