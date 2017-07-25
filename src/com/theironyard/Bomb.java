package com.theironyard;

/**
 * Created by Vijee on 7/24/17.
 */
public class Bomb extends Soldier {

    public String toString(){
        return "Bomb!!! This line is resulting from method of a class returned by extending the interface ";
    }

    public Bomb(String name, int rank, int serviceNumber) {
        super( name, rank, serviceNumber );
    }

    @Override
    public void speak() {
        System.out.println("I'm a bomb!!!");
    }
}
