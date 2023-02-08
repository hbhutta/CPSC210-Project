package model.entities;

public class Board {
    private static final int SIZE = 9;

    private Stone[][] stones;

    public Board() {
        this.stones = new Stone[SIZE][SIZE];
    }

    public void placeStone(Stone stone) {
        this.setStone(stone);
        this.createStoneNeighbours(stone);
    }

    private void setStone(Stone stone) {
        int row = stone.getRow();
        int column = stone.getColumn();
        if (this.stones[row][column] != null) {
            this.stones[row][column] = stone;
        }
    }

    private void createStoneNeighbours(Stone stone) {
        int row = stone.getRow();
        int column = stone.getColumn();
        Stone top, bottom, left, right;

        if (row - 1 < 0) {
            top = null;
        } else {
            top = this.stones[row-1][column];
        }

        if (column - 1 < 0) {
            left = null;
        } else {
            left = this.stones[row][column-1];
        }

        if (row + 1 > SIZE) {
            bottom = null;
        } else {
            bottom = this.stones[row+1][column];
        }

        if (column + 1 > SIZE) {
            right = null;
        } else {
            right = this.stones[row][column+1];
        }

        if (top == null) {
            top.setValue(0);
        }
        if (bottom == null) {
            bottom.setValue(0);
        }
        if (left == null) {
            left.setValue(0);
        }
        if (right == null) {
            right.setValue(0);
        }

        stone.setNeighbours(top, bottom, left, right);
    }
}
