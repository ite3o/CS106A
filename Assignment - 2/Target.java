/*
 * File: Target.java
 * Name:
 * Section Leader:
 * -----------------
 * This file is the starter file for the Target problem.
 */

import acm.graphics.*;
import acm.program.*;
import java.awt.*;

public class Target extends GraphicsProgram {

  /**
   *
   */
  private static final long serialVersionUID = 1L;

  public void run() {
    for (int i = 1; i <= 3; i++) {
      int r = 200 - 55 * i;

      GOval oval = new GOval(
        getWidth() / 2 - r,
        getHeight() / 2 - r,
        2 * r,
        2 * r
      );

      if ((i % 2) != 0) {
        oval.setFillColor(Color.RED);
        oval.setFilled(true);
      } else {
        oval.setFillColor(Color.WHITE);
        oval.setFilled(true);
      }

      add(oval);
    }
  }
}
