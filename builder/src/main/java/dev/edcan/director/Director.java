package dev.edcan.director;


import dev.edcan.builder.HouseBuilder;
import dev.edcan.house.ModernHouse;

public class Director {



    public void constructWesternHouse(HouseBuilder builder) {
        builder.buildDoors();
        builder.buildGarage();
        builder.buildRoof();
        builder.buildGarage();
        builder.buildWalls();
        builder.buildWindows();
    }

    public void constructModernHouse(HouseBuilder builder) {
        builder.buildDoors();
        builder.buildGarage();
        builder.buildRoof();
        builder.buildGarage();
        builder.buildWalls();
        builder.buildWindows();
    }
}
