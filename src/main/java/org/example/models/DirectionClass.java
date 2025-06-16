package org.example.models;

public class DirectionClass {
    public static DirectionClass NORTH= new DirectionClass("N");
    public static DirectionClass SOUTH= new DirectionClass("S");
    public static DirectionClass EAST= new DirectionClass("E");
    public static DirectionClass WEST= new DirectionClass("W");
 // TODO ???? dont understand creating object within the class ?
    public final String value; // so it cant be changed ???
    private DirectionClass(String v){ // putting this private so can create object from outside
        value=v;
    }
}
