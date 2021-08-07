package ru.ruslan.springapp.controller;

public class Car {

    private String color;
    private String type;

    public Car(String color, String type){
       this.color = color;
       this.type = type;
    }
    public String getcolor(){
        return color;
    }

    // standard getters setters
}