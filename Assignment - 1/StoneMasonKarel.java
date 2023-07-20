/*
 * File: StoneMasonKarel.java
 * --------------------------
 * The StoneMasonKarel subclass as it appears here does nothing.
 * When you finish writing it, it should solve the "repair the quad"
 * problem from Assignment 1.  In addition to editing the program,
 * you should be sure to edit this comment so that it no longer
 * indicates that the program does nothing.
 */

import stanford.karel.*;

public class StoneMasonKarel extends SuperKarel {

  public void run() {
    while (frontIsClear()) {
      moveUp();
      reposition();
      moveDown();
      gotoNextPoint();

      if (frontIsBlocked()) {
        if (leftIsClear()) {
          moveUp();
          reposition();
          moveDown();
        }
      }

      if (leftIsBlocked()) {
        if (rightIsBlocked()) {
          move();
          move();
          move();
          move();
          moveUp();
          reposition();
          moveDown();
        }
      }
    }
  }

  private void moveUp() {
    if (leftIsClear()) {
      turnLeft();
      while (frontIsClear()) {
        if (beepersPresent()) {
          move();
        } else {
          putBeeper();
          move();
        }
      }
    }
  }

  private void reposition() {
    turnAround();
  }

  private void moveDown() {
    while (frontIsClear()) {
      if (beepersPresent()) {
        move();
      } else {
        putBeeper();
        move();
      }
    }
    turnLeft();
  }

  private void gotoNextPoint() {
    move();
    move();
    move();
    move();
  }
}
