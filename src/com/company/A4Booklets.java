package com.company;

public class A4Booklets implements Stationary{
    public int booklets = 1000;

    @Override
    public void addItem(Integer amount) {
        booklets += amount;
        System.out.println("There were " + (booklets-1) + " pens but now there are " + booklets + " pens");

    }

    @Override
    public void removeItem(Integer amount) {
        booklets -= amount;
        System.out.println("There were " + (booklets-1) + " pens but now there are " + booklets + " pens");
    }

    @Override
    public int stationaryStatus() {
        System.out.println("There were " + booklets + " pens left");
        return booklets;
    }
}
