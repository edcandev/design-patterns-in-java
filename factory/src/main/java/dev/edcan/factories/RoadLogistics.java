package dev.edcan.factories;

import dev.edcan.transports.Transport;
import dev.edcan.transports.Truck;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}