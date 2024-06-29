package dev.edcan.builder.impl;

import dev.edcan.builder.HouseBuilder;
import dev.edcan.house.WesternHouse;

public class WesternHouseBuilder implements HouseBuilder {

    WesternHouse westernHouse;

    public WesternHouseBuilder() {
        reset();
    }
    @Override
    public void reset() {
        westernHouse = new WesternHouse();
    }

    @Override
    public void buildWalls() {
        westernHouse.setWalls("Walls built");
    }
    @Override
    public void buildDoors() {
        westernHouse.setDoors("Doors built");
    }
    @Override
    public void buildWindows() {
        westernHouse.setDoors("Windows built");
    }
    @Override
    public void buildRoof() {
        westernHouse.setRoof("Roof built");
    }
    @Override
    public void buildGarage() {
        westernHouse.setGarage("Garage built");
    }
    public WesternHouse getResult() {
        return this.westernHouse;
    }
}
