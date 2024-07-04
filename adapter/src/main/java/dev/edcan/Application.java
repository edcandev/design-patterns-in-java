package dev.edcan;

import dev.edcan.adapters.SquarePegAdapter;
import dev.edcan.round.RoundHole;
import dev.edcan.round.RoundPeg;
import dev.edcan.square.SquarePeg;

public class Application {

    public Application() {

    }

    public void init() {

        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if(roundHole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }

        SquarePeg smallSquarePeg = new SquarePeg(2);
        SquarePeg largeSquarePeg = new SquarePeg(20);

        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);

        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

    }
}
