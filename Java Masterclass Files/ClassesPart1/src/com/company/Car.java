package com.company;

public class Car {

    //state components for which we define fields
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    //creating a public setter method for another class to use
    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if(validModel.equals("carrera") || validModel.equals("commodore")){
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

    //creating a public setter method for another class to use
    public String getModel() {
        return this.model;
    }



}
