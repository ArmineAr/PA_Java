package org.example.models;

public enum Direction {
    NORTH("N"),
    SOUTH("S"),
    EAST("E"),
    WEST("W");

    public final String value; //TODO ??? why pub and final
    Direction(String v){  //TODO ?? why do we need a constructor and why not private?
        value=v;
    }
    public String getDirection(){
        return value;
    }
}
