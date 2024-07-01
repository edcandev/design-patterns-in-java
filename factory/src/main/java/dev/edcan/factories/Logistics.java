package dev.edcan.factories;

import dev.edcan.transports.Transport;

public abstract class Logistics {

    public void planDelivery() {
        System.out.println("PLANNING DELIVERY...");
    }

    public abstract Transport createTransport();

}
