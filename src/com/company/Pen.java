package com.company;

public class Pen implements Stationary{

    public int pens = 1000;

    @Override
    public void addItem(Integer amount) {
        pens += amount;
        System.out.println("There were " + (pens-amount) + " pens but now there are " + pens + " pens");

    }

    @Override
    public void removeItem(Integer amount) {
        pens -= amount;
        System.out.println("There were " + (pens+amount) + " pens but now there are " + pens + " pens");
    }

    @Override
    public int stationaryStatus() {
        System.out.println("There were " + pens + " pens left");
        return pens;
    }
}
