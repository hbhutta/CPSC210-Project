package ui;

import model.entities.Board;

import java.util.Scanner;

/**
 * The GoGame class displays the board with zero or more stones on it
 * and asks the user for next move
 */
public class GoGame {
    private static final int SIZE = 3;
    private Board board;
    private Scanner scanner;

    public GoGame(Board board) {
        this.board = board;
        this.startGame();
        this.scanner = new Scanner(System.in);
    }

    private void startGame() {
        this.welcomePlayer();
        this.display();
    }

    private void welcomePlayer() {
        System.out.println("Welcome. Game Started.");
    }

    /**
     * Displays the stones on the Board attribute
     */
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("0 ");
            }
            System.out.print("\n");
        }
    }

    public void getMove(String message) {
        System.out.println(message);
        System.out.println("Enter row: ");
        int row = scanner.nextInt();
        System.out.println("Enter column");
        int column = scanner.nextInt();
    }

    public void getBlackMove() {

    }

    public void getWhiteMove() {

    }

}
