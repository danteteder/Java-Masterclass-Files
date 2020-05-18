package com.company;

public class Printer {
    private int tonerLevel ;
    private int numberOfPages ;
    private boolean duplexOrNot;

    public Printer(int tonerLevel, int numberOfPages, boolean duplexOrNot) {
        if(tonerLevel >= 1 && tonerLevel <=100){
            this.tonerLevel = tonerLevel;
        } else {
            this.tonerLevel = -1;
        }
        this.numberOfPages = numberOfPages;
        this.duplexOrNot = duplexOrNot;
    }

    public int fillUpToner(int tonerAmount){
        if(tonerLevel >0 && tonerAmount <= 100){
            if(this.tonerLevel + tonerAmount >100){
                return -1;
            }
            this.tonerLevel += tonerAmount;
            return this.tonerLevel;
        } else {
            return -1;
        }
    }

    public void printPage(){
        System.out.println("Printing page --- beep boop");
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public void setTonerLevel(int tonerLevel) {
        this.tonerLevel = tonerLevel;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public boolean isDuplexOrNot() {
        return duplexOrNot;
    }

    public void setDuplexOrNot(boolean duplexOrNot) {
        this.duplexOrNot = duplexOrNot;
    }
}
