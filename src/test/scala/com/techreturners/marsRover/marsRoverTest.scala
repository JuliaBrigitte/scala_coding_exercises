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

  var coordinates=new Coordinates(1,1);

  "Move along the grid" should "move by one and stop at edges" in
  {
    coordinates.moveEast()
    assert(coordinates.currentStatus() == "0,1");
    coordinates.moveEast()
    assert(coordinates.currentStatus() == "0,1");
    coordinates.moveSouth()
    assert(coordinates.currentStatus() == "0,0");
    coordinates.moveSouth()
    assert(coordinates.currentStatus() == "0,0");
    coordinates.moveWest()
    assert(coordinates.currentStatus() == "1,0");
    coordinates.moveWest()
    assert(coordinates.currentStatus() == "2,0");
    coordinates.moveWest()
    assert(coordinates.currentStatus() == "3,0");
    coordinates.moveWest()
    assert(coordinates.currentStatus() == "4,0");
    coordinates.moveWest()
    assert(coordinates.currentStatus() == "5,0");
    coordinates.moveWest()
    assert(coordinates.currentStatus() == "5,0");
    coordinates.moveEast()
    assert(coordinates.currentStatus() == "4,0");
    coordinates.moveNorth()
    assert(coordinates.currentStatus() == "4,1");
    coordinates.moveNorth()
    assert(coordinates.currentStatus() == "4,2");
    coordinates.moveNorth()
    assert(coordinates.currentStatus() == "4,3");
    coordinates.moveNorth()
    assert(coordinates.currentStatus() == "4,4");
    coordinates.moveNorth()
    assert(coordinates.currentStatus() == "4,5");
    coordinates.moveNorth()
    assert(coordinates.currentStatus() == "4,5");

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
