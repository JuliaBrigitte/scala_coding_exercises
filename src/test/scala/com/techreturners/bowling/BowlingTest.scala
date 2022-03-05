package com.techreturners.bowling
import org.scalatest.flatspec.AnyFlatSpec

class BowlingTest extends AnyFlatSpec
{
  val bowling = new Bowling

  "String 41 32 9- 9- 9- 9- 9- 9- 9- 9-" should "return 82" in
  {
    assert(bowling.calculateScore("41 32 9- 9- 9- 9- 9- 9- 9- 9-") == 82)
  }

  "String 9- 9- 9- 9- 9- 9- 9- 9- 9- 9-" should "return 90" in
  {
    assert(bowling.calculateScore("9- 9- 9- 9- 9- 9- 9- 9- 9- 9-") == 90)
  }

  "String 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5" should "return 150" in
  {
    assert(bowling.calculateScore("5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5") == 150)
  }

  "String 12 23 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5" should "return 130" in
    {
      assert(bowling.calculateScore("12 23 5/ 5/ 5/ 5/ 5/ 5/ 5/ 5/5") == 128)
    }

  "String 12 23 -1 5/ 5/ 5/ 5/ 5/ 5/ 5/5" should "return 114" in
    {
      assert(bowling.calculateScore("12 23 -1 5/ 5/ 5/ 5/ 5/ 5/ 5/5") == 114)
    }

  //added one more test
  //15+5+1+15+20+25+12+5+15+15=128
  "String X 23 -1 5/ 5/ X 5/ 23 5/ 5/5" should "return 128" in
    {
      assert(bowling.calculateScore("X 23 -1 5/ 5/ X 5/ 23 5/ 5/5") == 128)
    }

  "String X X X X X X X X X X X X" should "return 300" in
  {
    assert(bowling.calculateScore("X X X X X X X X X X X X") == 300)
  }

  //180+1+1+11+21=214
  "String X X 1- 1- X X X X X X X X" should "return 214" in
    {
      assert(bowling.calculateScore("X X 1- 1- X X X X X X X X") == 214)
    }

  //240+3+5=248
  "String 12 23 X X X X X X X X X X" should "return 248" in
  {
    assert(bowling.calculateScore("12 23 X X X X X X X X X X") == 248)
  }

  //180+7+8 +24+17=236
  "String X X 43 44 X X X X X X X X" should "return 226" in
    {
      assert(bowling.calculateScore("X X 43 44 X X X X X X X X") == 236)
    }

  "String -1 11 X X X X X X X X X X" should "return 243" in
    {
      assert(bowling.calculateScore("-1 11 X X X X X X X X X X") == 243)
    }

  //    input empty string
  "An empty string" should "return 0" in
{
  assert(bowling.calculateScore("") == 0)
}
}
