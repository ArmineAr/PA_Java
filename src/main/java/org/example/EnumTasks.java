package org.example;

import org.example.models.Direction;
import org.example.models.DirectionClass;

import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthOptionPaneUI;


public class EnumTasks {
    public static void main(String[] args) {

      //??  EnumTasks tasks= new EnumTasks();
        drive(Direction.EAST);
        System.out.println(Direction.WEST);
        Direction dir1= Direction.WEST;
        System.out.println(dir1);
        System.out.println(Direction.valueOf("WEST")); // TODO ??? shouldnt this print W ?/
        System.out.println(Direction.EAST.getDirection()); // TODO ???
        //if there was no enum we would have to create DiretionClass with 4 different objects
        System.out.println(DirectionClass.EAST); // TODO ????


        //HOMEWORK-------------------
      //  Create an enum DayOfWeek with constants for each day (MONDAY to SUNDAY).
        //  Task: Print a message based on the current day.
        dayOfWeek(DayOfWeek.MONDAY);
        dayOfWeek(DayOfWeek.valueOf("MONDAY"));
        //TODO ?? whats the difference between those two ?

        // Enum with Switch Case
        //Use the DayOfWeek enum in a switch statement to print whether the day is a weekday or weekend.
        isWeekend(DayOfWeek.MONDAY);
        isWeekend(DayOfWeek.SUNDAY);

        //3.	Enum with Methods
        //                Create an enum Season with a method getAverageTemp().
        //	•	Task: Print the average temperature for each season.
        System.out.println("average temperature in  " + Seasons.SUMMER.toString().toLowerCase() + " is: " + Seasons.SUMMER.avgTemp);
        System.out.println("average temperature in summer is: " + Seasons.SUMMER.getAvgTemp());
        //TODO whats the difference between these two ?


    }
    public static void dayOfWeek(DayOfWeek day){
        if(day==DayOfWeek.MONDAY){
            System.out.println("it is Monday");
        } else if(day==DayOfWeek.TUESDAY){
            System.out.println("it is Tuesday"); }
            //etc.

    }

    public static void isWeekend(DayOfWeek day){
        switch (day){
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY:
                System.out.println("it is weekday");
                break;
            case SATURDAY, SUNDAY:
                System.out.println("it is weekend");
                break;
        }
        // or old way write only cases and than in the end the action and break
       // case MONDAY,
      //  case TUESDAY,...

    }
    public static void drive(Direction d){
//        if (d==Direction.EAST){
//            System.out.println("go east");
//        } or we can also use switch
        switch (d) {
            case EAST:
                System.out.println("go east");
                break;
            case NORTH:
                System.out.println("go north");
                break;  //etc.
        }
    }

}
