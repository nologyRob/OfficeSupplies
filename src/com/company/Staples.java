package com.company;

public class Staples implements Stationary{
    public int staples = 8000;

    @Override
    public void addItem(Integer amount) {
        staples += amount;
        System.out.println("There were " + (staples-1) + " pens but now there are " + staples + " pens");

    }

    @Override
    public void removeItem(Integer amount) {
        staples -= amount;
        System.out.println("There were " + (staples-1) + " pens but now there are " + staples + " pens");
    }

    @Override
    public int stationaryStatus() {
        System.out.println("There were " + staples + " pens left");
        return staples;
    }
}
