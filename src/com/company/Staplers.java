package com.company;

public class Staplers implements Stationary{
    public int staplers = 200;

    @Override
    public void addItem(Integer amount) {
        staplers += amount;
        System.out.println("There were " + (staplers-1) + " pens but now there are " + staplers + " pens");

    }

    @Override
    public void removeItem(Integer amount) {
        staplers -= amount;
        System.out.println("There were " + (staplers-1) + " pens but now there are " + staplers + " pens");
    }

    @Override
    public int stationaryStatus() {
        System.out.println("There were " + staplers + " pens left");
        return staplers;
    }
}
