package com.techreturners.marsRover;

import org.scalatest.flatspec.AnyFlatSpec;

class marsRoverTest extends AnyFlatSpec
{
//    Test cases
//    single turns left and right and move to test turn and move
  var direction=new Direction('N');

  "Direction facing north" should "turn left to W then S then E" in
  {
    direction.turnLeft()
    assert(direction.currentStatus() == 'W');
    direction.turnLeft()
    assert(direction.currentStatus() == 'S');
    direction.turnLeft()
    assert(direction.currentStatus() == 'E');
  }
  "Direction east" should "turn right to S then W then N" in
  {
    direction.turnRight()
    assert(direction.currentStatus() == 'S');
    direction.turnRight()
    assert(direction.currentStatus() == 'W');
    direction.turnRight()
    assert(direction.currentStatus() == 'N');
  }

//  marsRover=new MarsRover([2,3,"N"]);
//
//"Mars Rover facing north" should "turn left to W then S then E in
//{
//  assert(marsRover.turnLeft().currentStatus() == "2,3,W");
//  assert(marsRover.turnLeft().currentStatus() == "2,3,S");
//  assert(marsRover.turnLeft().currentStatus() == "2,3,E");
//}
//"Mars Rover facing east" should "turn left to S then W then N in
//{
//  assert(marsRover.turnRight().currentStatus() == "2,3,S");
//  assert(marsRover.turnRight().currentStatus() == "2,3,W");
//  assert(marsRover.turnRight().currentStatus() == "2,3,N");
//}
//    moveTo strings with 2,3,many
//
//    Edge cases.
//    End of grid: do turns but stop and do not fall of grid
}
