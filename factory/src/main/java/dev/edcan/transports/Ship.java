package dev.edcan.transports;

public class Ship implements Transport {

    @Override
    public void deliver() {
        System.out.println("DELIVERED BY SEA");
    }
}
