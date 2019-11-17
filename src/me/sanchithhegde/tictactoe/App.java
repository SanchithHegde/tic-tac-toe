package me.sanchithhegde.tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
  /**
   * Driver method to test implementation.
   */
  public static void main(String[] args) throws Exception {
    MonteCarloTreeSearch mcts = new MonteCarloTreeSearch();
    Board board = new Board();
    Scanner scanner = new Scanner(System.in);
    int player = Board.P1;
    int totalMoves = Board.DEFAULT_BOARD_SIZE * Board.DEFAULT_BOARD_SIZE;
    int move = -1;
    Position pos;
    boolean movePlayed = false;

    // Clear the console
    System.out.print("\033[H\033[2J");

    for (int i = 0; i < totalMoves; i++) {
      board.printBoard();

      if (player == 2) {
        System.out.println("\nComputer's Turn");
        board = mcts.findNextMove(board, player);
      } else {
        movePlayed = false;
        
        do {
          System.out.print("\nEnter position to perform move (1-9) : ");
          
          try {
            move = scanner.nextInt() - 1;
          } catch (InputMismatchException e) {
            System.out.println("Invalid input!");
            scanner.next();
          }
          pos = new Position(move / 3, move % 3);
          
          for (Position p : board.getEmptyPositions()) {
            if (p.equals(pos)) {
              board.performMove(player, pos);
              movePlayed = true;
              break;
            }
          }
        } while (movePlayed == false);
      }

      switch (board.checkStatus()) {
        case Board.P1:
          board.printBoard();
          System.out.println("\n\t\u001B[1;32mY O U   W I N !\u001B[0m\n");
          scanner.close();
          return;

        case Board.P2:
          board.printBoard();
          System.out.println("\n\t\u001B[1;31mY O U   L O S E !\u001B[0m\n");
          scanner.close();
          return;

        case Board.DRAW:
          board.printBoard();
          System.out.println("\n\t\u001B[1;34mI T ' S   A   D R A W !\u001B[0m\n");
          scanner.close();
          return;

        default:
          break;
      }

      System.out.println();
      player = 3 - player;
    }
    scanner.close();
  }

}