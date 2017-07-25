package com.theironyard;

/**
 * Created by Vijee on 7/24/17.
 */
public class Navy extends Soldier {

    public Navy(String name, int rank, int serviceNumber) {
        super( name, rank, serviceNumber );
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getRank() {
        return super.getRank();
    }

    @Override
    public int getServiceNumber() {
        return super.getServiceNumber();
    }


    @Override
    public void setName(String name) {
        super.setName( name );
    }

    @Override
    public void setRank(int rank) {
        super.setRank( rank );
    }

    @Override
    public void setServiceNumber(int serviceNumber) {
        super.setServiceNumber( serviceNumber );
    }

    @Override
    public void speak() {
        System.out.println("Yes Sir!!!") ;
    };

    public void sleep(){
        System.out.println("I sleep for 8 hours");
    }

    public void eat(){
        System.out.println("I eat bread and butter");
    }

    public void walk(){
        System.out.println("I walk really slow");
    }


}
