package com.company;

import org.junit.Test;

import static org.junit.Assert.*;

public class SuppliesTest {

    Supplies supplies = new Supplies();

    @Test
    public void remove_258_pens_returns_remaining_balance(){
        supplies.pens.removeItem(258);
        assertEquals((1000-258),supplies.pens.stationaryStatus());
    }

    @Test
    public void remove_200_pens_returns_remaining_balance(){
        supplies.pens.removeItem(200);
        assertEquals((800),supplies.pens.stationaryStatus());
    }
    @Test
    public void tenPensFor250StaffMembersReturnsNegativeNegative1500(){
        supplies.pens.removeItem((250*10));
        assertEquals((1000-(250*10)),supplies.pens.stationaryStatus());
    }
    @Test
    public void NinetyTwoStaplesPerStaplerReturnsNegativeAmount(){
        supplies.staples.removeItem((92*supplies.staplers.staplers));
        assertEquals(-10400,supplies.staples.stationaryStatus());
    }
}