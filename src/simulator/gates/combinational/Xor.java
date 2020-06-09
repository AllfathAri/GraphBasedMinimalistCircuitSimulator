package simulator.gates.combinational;

import simulator.network.Link;
import simulator.network.Node;

public class Xor extends Node {
    public Xor(String label, Link... links) {
        super(label, links);
        addOutputLink(false);
    }

    @Override
    public void evaluate() {
        int ones = 0;
        for (Link link: getInputs()) {
            if (link.getSignal()) {
                ones++;
            }
        }

        getOutput(0).setSignal(ones % 2 != 0);
    }
}
