package com.theironyard;

/**
 * Created by Vijee on 7/24/17.
 */

public abstract class Soldier implements MartialArts, BallisticMissile, Karate {
    String name;
    int rank;
    int serviceNumber;

    public Soldier(String name, int rank, int serviceNumber) {
        this.name = name;
        this.rank = rank;
        this.serviceNumber = serviceNumber;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public int getServiceNumber() {
        return serviceNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setServiceNumber(int serviceNumber) {
        this.serviceNumber = serviceNumber;
    }

    public abstract void speak();

    public void sleep(){
    };

    public void eat(){

    };

    public void walk(){
     };

    @Override
    public void boost() {
        System.out.println("Dave, proceed with step 1 : Boost");
    }

    @Override
    public void midcourse() {
        System.out.println("Dave, proceed with Step 2 : Midcourse");
    }

    @Override
    public void terminal() {
        System.out.println("Dave, proceed with Step 3 : Terminal");
    }

    @Override
    public void punch() { System.out.println("Punch..."); }

    @Override
    public void kick() { System.out.println("Kick..."); }

    @Override
    public Class<Bomb> Kata() {
        return Bomb.class;
    }

    @Override
    public void slashdown() {
        System.out.println("Default method implementation - Ask the person in martial art to slash down the opponent");
    }
}
