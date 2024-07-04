package dev.edcan.adapters;

import dev.edcan.round.RoundPeg;
import dev.edcan.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {

    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        // Calculate a minimum circle radius, which can fit this peg.
        return (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
    }



}
