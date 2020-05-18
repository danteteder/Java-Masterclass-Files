package com.company;

public class Main {


    public static void main(String[] args) {

        Gearbox mcLaren = new Gearbox(6);
        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));

        //
        //cuz gear is an innerclass of gearbox we need to specify like this
        //mcLaren.new means we're using the instance of gearbox to create an inner class
        //usually the inner class is private, so you dont want ppl accessing it anyway
        //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //cant write it like this Gearbox.Gear second = new Gearbox.Gear(2, 15.4);
        //System.out.println(first.driveSpeed(1000));




    }
}
