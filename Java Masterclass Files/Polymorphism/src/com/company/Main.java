package com.company;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here";
    }

    public String getName() {
        return name;

    }
}

//using inheritance we are initializing the name variable from the base class Movie
class Jaws extends Movie {
    public Jaws(){
        super("Jaws");
    }

    public String plot(){
        return "A shark eats lots of people";
    }

}

class IndependenceDay extends Movie {
    public IndependenceDay() {
        super("Independence Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }
}

class MazeRunner extends Movie {

    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class Forgettable extends Movie {
    public Forgettable() {
        super("Forgettable");

        //no plot method
    }
}


public class Main {

    public static void main(String[] args) {
        for(int i = 1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot : " + movie.plot() + "\n");
            //this part "Plot : " + movie.plot() is POLYMORPHISM
            //So its looking at the object called movie, variable that we created, that was returned from randomMovie method
            //looking at the object and seeing if its got a method plot() and Java automatically
            //assigning different functionality depending on the type of object we've created
            //bearing in mind that all these objects are inherited from the base Movie class
            //for the Forgettable movie, Java finds the plot "no plot here" FROM MOVIE class automatically
        }

    }

    public static Movie randomMovie(){
        //casting into int because math.random gives double
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number generated was " + randomNumber);
        switch(randomNumber){
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new Forgettable();
            default:
                return null;

        }

    }

}
