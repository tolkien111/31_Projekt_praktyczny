package edu.sda.grcy.patterns.creational.factory;

//usuwamy public żeby klasa nie była dostępna  w innych pakietach
class MacBookAir extends MacBook{

    private String memory;
    private String disc;
    private int screenSize;

    //usuwamy public żeby konsktuktor nie był dostępny do tworzenia obiektów w innych pakietach
    MacBookAir(String memory, String disc, int screenSize) {
        this.memory = memory;
        this.disc = disc;
        this.screenSize = screenSize;
    }

    @Override
    public String getMemory() {
        return memory;
    }

    @Override
    public String getDisc() {
        return disc;
    }

    @Override
    public int getScreenSize() {
        return screenSize;
    }
}
