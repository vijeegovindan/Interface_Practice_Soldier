package com.theironyard;

public class Main {

    public static void main(String[] args) {

        Army army = new Army("Victor", 8, 12456);

        System.out.println("Army Personnel - Details");
        System.out.println("Name: " + army.getName());
        System.out.println("Soldier Rank: " + army.getRank());
        System.out.println("Service Number: " + army.getServiceNumber());
        army.sleep();
        army.eat();
        army.walk();

        System.out.println("-----------------------------------------------");
        System.out.println("Navy Personnel - Details");

        Navy navy = new Navy("Dave", 7, 12458);
        System.out.println("Name: "  + navy.getName());
        System.out.println("Soldier Rank: " + navy.getRank());
        System.out.println("Service Number: " + navy.getServiceNumber());
        navy.sleep();
        navy.eat();
        navy.walk();

        System.out.println("-----------------------------------------------");
        System.out.println("Airforce Personnel - Details");

        AirForce airforce = new AirForce("Joe", 6, 12459);
        System.out.println("Name: " + airforce.getName());
        System.out.println("Soldier Rank: " + airforce.getRank());
        System.out.println("Service Number: " + airforce.getServiceNumber());
        airforce.sleep();
        airforce.eat();
        airforce.walk();

        System.out.println("-----------------------------------------------");
        System.out.println("Few samples of fighting");


        navy.boost();
        navy.speak();
        navy.midcourse();
        navy.speak();
        navy.terminal();
        navy.speak();

        army.kick();
        army.speak();
        army.punch();
        army.kick();

        System.out.println("-----------------------------------------------");

        Bomb bomb = new Bomb("Joe", 6, 12459);
        System.out.println(bomb.toString());

        army.slashdown();
    }
}
