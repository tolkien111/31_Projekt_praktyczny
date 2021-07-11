package edu.sda.grcy.patterns.behavioral.strategy;

@FunctionalInterface
public interface TravelStrategy {
    String setTravelPlan (String from, String to);
}
