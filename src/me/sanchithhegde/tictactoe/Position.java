package me.sanchithhegde.tictactoe;

/**
 * Class for implementing a position on the board.
 */
public class Position {
  private int valueX;
  private int valueY;

  public Position() {
  }

  public Position(final int x, final int y) {
    this.valueX = x;
    this.valueY = y;
  }

  public int getX() {
    return valueX;
  }

  public void setX(final int x) {
    this.valueX = x;
  }

  public int getY() {
    return valueY;
  }

  public void setY(final int y) {
    this.valueY = y;
  }

  public boolean equals(final Position pos) {
    return this.valueX == pos.valueX && this.valueY == pos.valueY;
  }
  
}