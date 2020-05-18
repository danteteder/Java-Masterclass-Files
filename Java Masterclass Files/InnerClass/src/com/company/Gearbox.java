package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);

        for(int i = 0; i<maxGears; i++) {
            addGear(i, i*5.3);
        }
    }



    public void operateClutch(boolean in){
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio ) {
        if((number >0) && (number <= maxGears)) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear){
        if((newGear >= 0) && (newGear <this.gears.size()) && this.clutchIsIn){
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected");
        } else {
            System.out.println("Grind! ");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs){
        if(clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        //otherwise if the clutch is in and the car can move, were gonna return
        return revs * gears.get(currentGear).getRatio();
    }


    //*IMPORTANT* Gearbox doesnt need to know the inner workings of Gear so we hide it
    private class Gear {
        //this int gearNumber is SHADOWING the gearbox class
        private int gearNumber ;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            //this.gearNumber is referring to the inner class Gear and not the Gearbox one
            this.gearNumber = gearNumber;
            this.ratio = ratio;
        }


        //revs = revolution per minute aka seed
        public double driveSpeed(int revs) {

            return revs*(this.ratio);
        }

        public double getRatio() {
            return ratio;
        }
    }


}
