package dev.edcan.builder.impl;

import dev.edcan.builder.HouseBuilder;
import dev.edcan.house.ModernHouse;
import dev.edcan.house.WesternHouse;

public class ModernHouseBuilder implements HouseBuilder {

    ModernHouse modernHouse ;

    public ModernHouseBuilder() {
        reset();
    }
    @Override
    public void reset() {
        modernHouse = new ModernHouse();
    }

    @Override
    public void buildWalls() {
        modernHouse.setWalls("Walls built");
    }
    @Override
    public void buildDoors() {
        modernHouse.setDoors("Doors built");
    }
    @Override
    public void buildWindows() {
        modernHouse.setDoors("Windows built");
    }
    @Override
    public void buildRoof() {
        modernHouse.setRoof("Roof built");
    }
    @Override
    public void buildGarage() {
        modernHouse.setGarage("Garage built");
    }
    public ModernHouse getResult() {
        return this.modernHouse;
    }
}
