package com.company;

import java.util.ArrayList;

public class GroceryList {
    //we dont define the type , because arraylists can hold objects
    //were creating an arraylist with objects that are of type String
    private ArrayList<String> groceryList = new ArrayList<String>();


    //add items to arraylist
    public void addGroceryItem(String item){
        groceryList.add(item);
    }

    //print items from arraylist
    public void printGroceryList(){
        System.out.println("You have " + groceryList.size() + " items in your grocery list");
        for(int i= 0; i<groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    //modify or replace items from arraylist
    public void modifyGroceryItem(int position, String newItem) {
            groceryList.set(position, newItem);
            System.out.println("Grocery item " + (position+1) + " has been modified");
        }

    //remove items from arraylist
    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
    }

    public String findItem(String searchItem) {
        //boolean exists = groceryList.contains(searchItem);
        //this searches item for you and returns the index
        int position = groceryList.indexOf(searchItem);
        if(position >= 0) {
            return groceryList.get(position);
        }
        return null;
    }



}
