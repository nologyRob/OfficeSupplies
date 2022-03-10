package com.company;

public class Rulers implements Stationary{
    public int rulers = 8000;

    @Override
    public void addItem(Integer amount) {
        rulers += amount;
        System.out.println("There were " + (rulers-1) + " pens but now there are " + rulers + " pens");

    }

    @Override
    public void removeItem(Integer amount) {
        rulers -= amount;
        System.out.println("There were " + (rulers-1) + " pens but now there are " + rulers + " pens");
    }

    @Override
    public int stationaryStatus() {
        System.out.println("There were " + rulers + " pens left");
        return rulers;
    }

}
