package com.techreturners.marsRover

class Coordinates(xVar: Int, yVar: Int)
{
  var x:Int =xVar;
  var y:Int =yVar;

  def move(dx: Int, dy: Int): Unit =
  {
    x=x+dx;
    y=y+dy;
  }
}
