package edu.sda.grcy.patterns.structual.flyweight;

public class FordMustangBase {
    private String color;
    private String engine;

    public FordMustangBase(String color, String engine) {
        System.out.println(this.getClass() + " constructor");
        this.color = color;
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public String getEngine() {
        return engine;
    }

    public String baseInfo() {
        return "Base: color " + color + ", engine " + engine;
    }
}
