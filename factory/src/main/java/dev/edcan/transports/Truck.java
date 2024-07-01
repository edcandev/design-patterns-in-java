package dev.edcan.transports;

public class Truck implements Transport {

    @Override
    public void deliver() {
        System.out.println("DELIVERED BY ROAD");
    }
}
