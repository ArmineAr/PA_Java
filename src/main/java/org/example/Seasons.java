package org.example;

public enum Seasons {
    WINTER(1),
    SPRING(10),
    SUMMER(30),
    AUTUMN(15);
    public final int avgTemp; //????
    Seasons(int avgTemp){  // ??
        this.avgTemp=avgTemp;
    }
    public int getAvgTemp(){ // ??
        return avgTemp;
    }
}
