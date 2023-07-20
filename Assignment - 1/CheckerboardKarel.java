/*
 * File: CheckerboardKarel.java
 * ----------------------------
 * When you finish writing it, the CheckerboardKarel class should draw
 * a checkerboard using beepers, as described in Assignment 1.  You
 * should make sure that your program works for all of the sample
 * worlds supplied in the starter folder.
 */

import stanford.karel.*;

public class CheckerboardKarel extends SuperKarel {

  public void run() {
    if (frontIsBlocked()) {
      turnLeft();

      while (frontIsClear()) {
        putBeeper();

        makeRow();
      }
    }

    if (facingEast()) {
      if (leftIsBlocked()) {
        putBeeper();
        while (frontIsClear()) {
          move();
          if (frontIsClear()) {
            move();
            putBeeper();
          }
        }
      }
    }

    while (frontIsClear()) {
      putBeeper();
      makeRow();
      if (facingEast()) {
        moveToWest();
      } else {
        moveToEast();
      }
    }
  }

  private void makeRow() {
    while (frontIsClear()) {
      move();
      if (frontIsClear()) {
        move();
        putBeeper();
      }
    }
  }

  private void moveToWest() {
    if (leftIsClear()) {
      turnLeft();
      move();
      turnLeft();
    } else {
      turnLeft();
    }
  }

  private void moveToEast() {
    if (rightIsClear()) {
      turnRight();
      move();
      turnRight();
    } else {
      turnRight();
    }
  }
}
