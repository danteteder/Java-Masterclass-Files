package com.company;

public class Main {

    public static void main(String[] args) {
        //definition for a base animal
	    Animal animal = new Animal("Animal", 1, 1, 5, 5);

	    Dog dog = new Dog("Husky", 8, 20, 2, 4, 1, 1, "Silky");
        //were able to use the eat method FROM Animal class, this is a feature of inheritance
        dog.eat();
        //dog.walk();
        dog.run();




    }
}
