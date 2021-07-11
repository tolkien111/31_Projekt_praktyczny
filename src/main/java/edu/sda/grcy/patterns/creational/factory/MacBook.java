package edu.sda.grcy.patterns.creational.factory;

abstract class MacBook {

    public abstract String getMemory();
    public abstract String getDisc();
    public abstract int getScreenSize();

    @Override
    public String toString() {
        return "MacBook{ " +
                "Memory: " + getMemory() +
                "Disc: " + getDisc() +
                "Screen: " + getScreenSize() + "}";
    }
}
