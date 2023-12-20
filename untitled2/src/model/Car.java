package model;

public abstract class Car {
    public abstract void carWheel(String Wheel);
    public abstract void carColor(String Color);
    public void  getcar (String acPoints,String engine,String Controls){


    }
    public AC getacPoints(){
        return new AC("4pointac");
    }
    public Engine getengine(){
        return new Engine("Hybrideengine","220cc");
    }
    public Controls getcontrols(){
        return new Controls("Hydraulic Brakes",6,8);
    }


    }

