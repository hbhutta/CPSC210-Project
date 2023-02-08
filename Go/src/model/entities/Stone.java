package model.entities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Stone {
    private static final int INITIAL_LIBERTY_COUNT = 4;
    private static final int EMPTY = 0, BLACK = 1, WHITE = 2;
    private int value;
    private int row;
    private int column;
    private List<Integer> libertyCoordinates;
    private List<Integer> neighbourValues;
    private StoneChain stoneChain;

    public Stone(int value, int row, int column, StoneChain stoneChain) {
        this.value = value;
        this.row = row;
        this.column = column;
        this.libertyCoordinates = new ArrayList<>();
        this.neighbourValues = new ArrayList<>();
        this.stoneChain = stoneChain;
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRow() {
        return this.row;
    }

    public int getColumn() {
        return this.column;
    }

    public List<Integer> getLibertyCoordinates() {
        return this.libertyCoordinates;
    }

    public StoneChain getStoneChain() {
        return this.stoneChain;
    }

    public void reduceLiberty() {
        // TODO
    }

    public void createLiberties() {

    }


    public List<Integer> getNeighbourValues() {
        return Collections.unmodifiableList(this.neighbourValues);
    }

    public void setNeighbours(Stone top, Stone bottom, Stone left, Stone right) {

        this.neighbourValues.add(top.getValue());
        this.neighbourValues.add(bottom.getValue());
        this.neighbourValues.add(left.getValue());
        this.neighbourValues.add(right.getValue());
    }
}
