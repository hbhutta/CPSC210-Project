package model.entities;

import java.util.ArrayList;
import java.util.List;

public class StoneChain {
    private static final int SIZE = 19;

    public List<Stone> prisoners;
    public List<Stone> liberties;

    public StoneChain() {
        this.prisoners = new ArrayList<>();
        this.liberties = new ArrayList<>();
    }

    public boolean isCapturable() {
        return this.liberties.isEmpty();
        // equivalently:
        // return this.liberties.size() == 0;
    }

}
