package com.company;


//if you want to inherit from another class you use EXTENDS keyword
//so through that we ccn use the state and behaviours of Animal class in this new Dog class
public class Dog extends Animal{

    //creating fields that are just for Dogs
    private int eyes;
    private int legs;
    private int teeth;
    private int tail;
    private String coat;

    //now we need to make sure that we have a constructor Dog that calls the other constructor Animal
    public Dog(String name, int size, int weight, int eyes, int legs, int teeth, int tail, String coat) {
        //super means to call a constructor that is for the class we're extending from
        //superclass initalizing fields from Animal class
        super(name, 1, 1, size, weight);
        //initializing the other fields unique to dogs
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    //overriding Animal method with a method thats unique to a dog
    //so creating a version of eat method from animal class to a dog class thats more unique, via right click
    private void chew(){
        System.out.println("Dog.chew() called");
    }



    //@Override here is because were overriding a method thats from the Animal class
    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
        //super.eat(); means Java will look for the superclass which is Animal and take eat method from there
        super.eat();
    }

    public void walk(){
        System.out.println("Dog.walk() is called");
        move(5);
    }

    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
